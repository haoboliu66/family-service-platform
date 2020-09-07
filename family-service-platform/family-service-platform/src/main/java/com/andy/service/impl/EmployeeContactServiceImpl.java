package com.andy.service.impl;

import com.andy.bean.EmployeeContact;
import com.andy.mapper.EmployeeContactMapper;
import com.andy.service.base.EmployeeContactService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工通讯录 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class EmployeeContactServiceImpl extends ServiceImpl<EmployeeContactMapper, EmployeeContact> implements EmployeeContactService {

}
