package com.andy.controller;

import com.alibaba.fastjson.JSONObject;
import com.andy.bean.Company;
import com.andy.bean.FcBuilding;
import com.andy.bean.FcEstate;
import com.andy.bean.FcUnit;
import com.andy.returnjson.ReturnObject;
import com.andy.service.EstateService;
import com.andy.vo.UnitMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author andy-liu
 * @date 2020/8/28 - 10:19 PM
 */

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {}, allowCredentials = "true")
@RequestMapping("/estate")
public class EstateController {

    @Autowired
    private EstateService estateService;

    @RequestMapping("/selectCompany")
    public String selectCompany() {
        List<Company> names = estateService.selectCompany();
        return JSONObject.toJSONString(new ReturnObject(names));
    }

    @RequestMapping(value = "/insertEstate", method = RequestMethod.POST)
    public String insertEstate(FcEstate estate) {
        System.out.println("estate == " + estate);
        Integer result = estateService.insertEstate(estate);
        System.out.println("result" + result);
        String msg;
        if (result == 0) {
            msg = "building number already exists";
        } else {
            msg = "success operations";
        }

        return JSONObject.toJSONString(new ReturnObject(result.toString(), msg));
    }


    /**
     * 完成楼宇的insertion和query
     *
     * @param buildingNumber
     * @param estateCode
     * @return
     */
    @RequestMapping("/selectBuilding")
    public String selectBuilding(Integer buildingNumber, String estateCode) {
        System.out.println("select building");
        List<FcBuilding> fcBuildings = estateService.selectBuildings(buildingNumber, estateCode);
        System.out.println(fcBuildings);
        return JSONObject.toJSONString(new ReturnObject(fcBuildings));
    }

    @RequestMapping("/updateBuilding")
    public String updateBuilding(FcBuilding fcBuilding) {
        System.out.println("updateBuilding");
        Integer result = estateService.updateBuilding(fcBuilding);
        String msg;
        if (result == 1) {
            msg = "update success";
        } else {
            msg = "update fail";
        }

        return JSONObject.toJSONString(new ReturnObject(msg));
    }

    @RequestMapping("/selectUnit")
    //接收数组参数
    public String selectUnit(@RequestBody UnitMessage[] unitMessages) {
        System.out.println("selectUnit");
        List<FcUnit> units = new ArrayList<>();
        for (UnitMessage msg : unitMessages) {
            units.addAll(estateService.selectUnit(msg));
        }

        return JSONObject.toJSONString(new ReturnObject(units));
    }

    /**
     * update unit infomation
     * @param fcUnit
     * @return
     */
    @RequestMapping("/updateUnit")
    public String updateUnit(FcUnit fcUnit){
        Integer res = estateService.updateUnit(fcUnit);
        String msg;
        if(res == 1){
            msg = "unit update success";
        }else{
            msg = "unit update fail";
        }
        return JSONObject.toJSONString(new ReturnObject(msg));
    }

//    @RequestMapping("/insertCell")
//    public String insertCell(@RequestBody ){
//
//    }

}
