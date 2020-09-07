package com.andy.service.impl;

import com.andy.bean.MessageSend;
import com.andy.mapper.MessageSendMapper;
import com.andy.service.base.MessageSendService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 信息发送 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class MessageSendServiceImpl extends ServiceImpl<MessageSendMapper, MessageSend> implements MessageSendService {

}
