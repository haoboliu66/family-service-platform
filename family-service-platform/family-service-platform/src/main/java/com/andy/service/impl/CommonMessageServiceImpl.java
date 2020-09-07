package com.andy.service.impl;

import com.andy.bean.CommonMessage;
import com.andy.mapper.CommonMessageMapper;
import com.andy.service.base.CommonMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 常用短信 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class CommonMessageServiceImpl extends ServiceImpl<CommonMessageMapper, CommonMessage> implements CommonMessageService {

}
