package com.andy.service.impl;

import com.andy.bean.DbSetting;
import com.andy.mapper.DbSettingMapper;
import com.andy.service.base.DbSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据库设置 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class DbSettingServiceImpl extends ServiceImpl<DbSettingMapper, DbSetting> implements DbSettingService {

}
