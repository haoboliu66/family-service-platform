package com.andy.service;

import com.andy.bean.*;
import com.andy.mapper.*;
import com.andy.vo.CellMessage;
import com.andy.vo.UnitMessage;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
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

    @Autowired
    private FcCellMapper fcCellMapper;

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
            building.setBuildingCode(estateCode + "B" + (i + 1));
            building.setBuildingName("Num" + (i + 1));
            building.setEstateCode(estateCode);

            fcBuildingMapper.insert(building);
            buildingList.add(building);
        }

        return buildingList;
    }

    /**
     * update building info
     *
     * @param fcBuilding
     * @return
     */
    public Integer updateBuilding(FcBuilding fcBuilding) {
        return fcBuildingMapper.updateById(fcBuilding);
    }

    /**
     * insert and query units
     *
     * @param unitMessage
     * @return
     */
    public List<FcUnit> selectUnit(UnitMessage unitMessage) {
        List<FcUnit> units = new ArrayList<>();
        for (int i = 0; i < unitMessage.getUnitCount(); i++) {
            FcUnit fcUnit = new FcUnit();
            fcUnit.setBuildingCode(unitMessage.getBuildingCode());
            fcUnit.setUnitCode(unitMessage.getBuildingCode() + "U" + (i + 1));
            fcUnit.setUnitName("Num" + (i + 1));
            fcUnitMapper.insert(fcUnit);
            units.add(fcUnit);
        }
        return units;
    }

    /**
     * update unit
     *
     * @param fcUnit
     * @return
     */
    public Integer updateUnit(FcUnit fcUnit) {
        return fcUnitMapper.updateById(fcUnit);
    }


    /**
     * insert and query cells
     *
     * @param cellMessages
     * @return
     */
    public List<FcCell> insertCell(CellMessage[] cellMessages) {
        List<FcCell> cellList = new ArrayList<>();
        for (CellMessage cellMessage : cellMessages) {
            // floor loop
            for (int i = 1; i <= cellMessage.getEndFloor(); i++) {
                // cell loop
                for (int j = cellMessage.getStartCellId(); j <= cellMessage.getEndCellId(); j++) {
                    FcCell cell = new FcCell();
                    cell.setUnitCode(cellMessage.getUnitCode());
                    cell.setCellCode(cellMessage.getUnitCode() + "C" + i + "0" + j);
                    cell.setCellName(i + "0" + j);
                    cell.setFloorNumber(i);
                    fcCellMapper.insert(cell);
                    cellList.add(cell);
                }
            }
        }

        return cellList;
    }


    public List<FcBuilding> selectBuildingByEstate(String estateCode) {
        QueryWrapper<FcBuilding> wrapper = new QueryWrapper<>();
        wrapper.eq("estate_code", estateCode);
        //用select指定要选择的resultSet
        wrapper.select("building_name", "building_code");
        return fcBuildingMapper.selectList(wrapper);
    }

    public List<FcUnit> selectUnitByBuildingCode(String buildingCode) {
        QueryWrapper<FcUnit> wrapper = new QueryWrapper<>();
        wrapper.eq("building_code", buildingCode);
        //用select指定要选择的resultSet
        wrapper.select("unit_code", "unit_name");

        return fcUnitMapper.selectList(wrapper);
    }

    public List<FcCell> selectCell(String unitCode) {
        QueryWrapper<FcCell> wrapper = new QueryWrapper<>();
        wrapper.eq("unit_code", unitCode);

        return fcCellMapper.selectList(wrapper);
    }

    public List<FcEstate> selectEstate(String company){
        QueryWrapper<FcEstate> wrapper = new QueryWrapper<>();
        wrapper.eq("company",company);

        return estateMapper.selectList(wrapper);
    }

}
