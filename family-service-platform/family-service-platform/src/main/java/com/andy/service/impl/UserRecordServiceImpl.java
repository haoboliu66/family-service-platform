package com.andy.service.impl;

import com.andy.bean.UserRecord;
import com.andy.mapper.UserRecordMapper;
import com.andy.service.base.UserRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户档案 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class UserRecordServiceImpl extends ServiceImpl<UserRecordMapper, UserRecord> implements UserRecordService {

}
