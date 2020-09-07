package com.andy.service.impl;

import com.andy.bean.EmailReceive;
import com.andy.mapper.EmailReceiveMapper;
import com.andy.service.base.EmailReceiveService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 邮件接受 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class EmailReceiveServiceImpl extends ServiceImpl<EmailReceiveMapper, EmailReceive> implements EmailReceiveService {

}
