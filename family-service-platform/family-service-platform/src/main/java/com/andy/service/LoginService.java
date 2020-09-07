package com.andy.service;

import com.andy.bean.UserRecord;
import com.andy.mapper.UserRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author andy-liu
 * @date 2020/6/4 - 5:28 PM
 */

@Service
public class LoginService {

    @Autowired
    private UserRecordMapper userRecordMapper;

    public UserRecord login(String username, String password) {
        return userRecordMapper.login(username, password);
    }
}
