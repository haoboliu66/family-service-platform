package com.andy.service.impl;

import com.andy.bean.Type;
import com.andy.mapper.TypeMapper;
import com.andy.service.base.TypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 类型库 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

}
