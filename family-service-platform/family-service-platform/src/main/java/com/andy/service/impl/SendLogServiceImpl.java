package com.andy.service.impl;

import com.andy.bean.SendLog;
import com.andy.mapper.SendLogMapper;
import com.andy.service.base.SendLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 发送日志表 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class SendLogServiceImpl extends ServiceImpl<SendLogMapper, SendLog> implements SendLogService {

}
