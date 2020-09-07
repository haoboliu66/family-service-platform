package com.andy.service.impl;

import com.andy.bean.CustomType;
import com.andy.mapper.CustomTypeMapper;
import com.andy.service.base.CustomTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 自定义类型 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class CustomTypeServiceImpl extends ServiceImpl<CustomTypeMapper, CustomType> implements CustomTypeService {

}
