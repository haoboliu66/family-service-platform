package com.andy.service.impl;

import com.andy.bean.Quick;
import com.andy.mapper.QuickMapper;
import com.andy.service.base.QuickService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 快捷方式 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class QuickServiceImpl extends ServiceImpl<QuickMapper, Quick> implements QuickService {

}
