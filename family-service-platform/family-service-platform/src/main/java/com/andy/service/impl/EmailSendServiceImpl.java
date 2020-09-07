package com.andy.service.impl;

import com.andy.bean.EmailSend;
import com.andy.mapper.EmailSendMapper;
import com.andy.service.base.EmailSendService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 邮件发送 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class EmailSendServiceImpl extends ServiceImpl<EmailSendMapper, EmailSend> implements EmailSendService {

}
