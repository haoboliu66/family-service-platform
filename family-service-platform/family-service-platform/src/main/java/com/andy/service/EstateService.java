package com.andy.service;

import com.andy.bean.Company;
import com.andy.bean.FcBuilding;
import com.andy.bean.FcEstate;
import com.andy.bean.FcUnit;
import com.andy.mapper.CompanyMapper;
import com.andy.mapper.FcBuildingMapper;
import com.andy.mapper.FcEstateMapper;
import com.andy.mapper.FcUnitMapper;
import com.andy.vo.UnitMessage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author andy-liu
 * @date 2020/8/28 - 10:21 PM
 */

@Service
public class EstateService {

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private FcEstateMapper estateMapper;

    @Autowired
    private FcBuildingMapper fcBuildingMapper;

    @Autowired
    private FcUnitMapper fcUnitMapper;

    public List<Company> selectCompany() {
        return companyMapper.selectCompany();
    }

    /*
    在插入数据前, 需要先判断前台传过来的住宅编号是否存在, 如果存在就不允许插入;
     */
    public Integer insertEstate(FcEstate estate) {

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("estate_code", estate.getEstateCode());

        FcEstate result = estateMapper.selectOne(queryWrapper);

        System.out.println("Result === " + result);

        if (result != null) {
            return 0;
        }
        return estateMapper.insert(estate);
    }

    /*
    插入再查询
     */
    public List<FcBuilding> selectBuildings(Integer buildingNumber, String estateCode) {
        List<FcBuilding> buildingList = new ArrayList<>();
        for (int i = 0; i < buildingNumber; i++) {
            FcBuilding building = new FcBuilding();
            building.setBuildingCode("B" + (i + 1));
            building.setBuildingName("Num" + (i + 1));
            building.setEstateCode(estateCode);

            fcBuildingMapper.insert(building);
            buildingList.add(building);
        }

        return buildingList;
    }

    /**
     * update building info
     * @param fcBuilding
     * @return
     */
    public Integer updateBuilding(FcBuilding fcBuilding){
       return fcBuildingMapper.updateById(fcBuilding);
    }

    public List<FcUnit> selectUnit(UnitMessage unitMessage){
        List<FcUnit> units = new ArrayList<>();
        for(int i = 0; i < unitMessage.getUnitCount(); i++){
            FcUnit fcUnit = new FcUnit();
            fcUnit.setBuildingCode(unitMessage.getBuildingCode());
            fcUnit.setUnitCode("U" + (i + 1));
            fcUnit.setUnitName("Num" + (i + 1));
            fcUnitMapper.insert(fcUnit);
            units.add(fcUnit);
        }
        return units;
    }

    /**
     * update unit
     * @param fcUnit
     * @return
     */
    public Integer updateUnit(FcUnit fcUnit){
        return fcUnitMapper.updateById(fcUnit);
    }

}
