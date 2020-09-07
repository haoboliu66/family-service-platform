package com.andy.service.impl;

import com.andy.bean.WorkDate;
import com.andy.mapper.WorkDateMapper;
import com.andy.service.base.WorkDateService;
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
public class WorkDateServiceImpl extends ServiceImpl<WorkDateMapper, WorkDate> implements WorkDateService {

}
