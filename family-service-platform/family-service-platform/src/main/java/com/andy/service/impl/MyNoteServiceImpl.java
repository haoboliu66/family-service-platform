package com.andy.service.impl;

import com.andy.bean.MyNote;
import com.andy.mapper.MyNoteMapper;
import com.andy.service.base.MyNoteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 我的记事本 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class MyNoteServiceImpl extends ServiceImpl<MyNoteMapper, MyNote> implements MyNoteService {

}
