package com.andy.service.impl;

import com.andy.bean.Color;
import com.andy.mapper.ColorMapper;
import com.andy.service.base.ColorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 颜色管理 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class ColorServiceImpl extends ServiceImpl<ColorMapper, Color> implements ColorService {

}
