package com.andy.service.impl;

import com.andy.bean.Date;
import com.andy.mapper.DateMapper;
import com.andy.service.base.DateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 工作日期 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class DateServiceImpl extends ServiceImpl<DateMapper, Date> implements DateService {

}
