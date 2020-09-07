package com.andy.service.impl;

import com.andy.bean.MessageReceive;
import com.andy.mapper.MessageReceiveMapper;
import com.andy.service.base.MessageReceiveService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 短信接受表 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class MessageReceiveServiceImpl extends ServiceImpl<MessageReceiveMapper, MessageReceive> implements MessageReceiveService {

}
