package com.andy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.andy.bean.UserRecord;
import com.andy.returnjson.Permission;
import com.andy.returnjson.Permissions;
import com.andy.returnjson.ReturnObject;
import com.andy.returnjson.UserInfo;
import com.andy.service.LoginService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author andy-liu
 * @date 2020/6/4 - 4:17 PM
 */

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {}, allowCredentials = "true")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/auth/2step-code")
    public Boolean test() {
        // not a necessary procedure
        return true;
    }


    @RequestMapping("/auth/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {

        System.out.println(username + "---" + password);
        UserRecord userRecord = loginService.login(username, password);
        userRecord.setToken(userRecord.getUserName());
        session.setAttribute("userRecord", userRecord);

        System.out.println("sessionId111== " + session.getId());
        /*
         Vue中代码决定, 返回结果集中必须有result属性, result中必须有token
         response.result
         result.token
         */
        //此处给对象赋值可以用builder模式来做
        ReturnObject returnObject = new ReturnObject(userRecord);
        return JSONObject.toJSONString(returnObject);
    }

    @RequestMapping("/user/info")
    public String getInfo(HttpSession session) {
        //session实现数据共享
        System.out.println("sessionId222== " + session.getId());
        UserRecord userRecord = (UserRecord) session.getAttribute("userRecord");
        System.out.println(userRecord);
        System.out.println("-----------");
        String[] roles = userRecord.getRole().getRolePrivileges().split("-");
        Permissions permissions = new Permissions();
        List<Permission> permissionList = new ArrayList<>();
        for (String role : roles) {
            permissionList.add(new Permission(role));
        }
        permissions.setPermissions(permissionList);
        UserInfo userInfo = new UserInfo(userRecord.getUserName(), permissions);

        return JSONObject.toJSONString(new ReturnObject(userInfo));
    }

    @RequestMapping("/auth/logout")
    public void logOut(HttpSession session) {
        System.out.println("log out");
        session.invalidate();

    }


}
