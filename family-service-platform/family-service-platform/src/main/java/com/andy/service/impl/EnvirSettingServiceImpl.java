package com.andy.service.impl;

import com.andy.bean.EnvirSetting;
import com.andy.mapper.EnvirSettingMapper;
import com.andy.service.base.EnvirSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 环境配置 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class EnvirSettingServiceImpl extends ServiceImpl<EnvirSettingMapper, EnvirSetting> implements EnvirSettingService {

}
