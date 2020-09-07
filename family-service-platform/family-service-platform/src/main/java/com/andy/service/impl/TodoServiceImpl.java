package com.andy.service.impl;

import com.andy.bean.Todo;
import com.andy.mapper.TodoMapper;
import com.andy.service.base.TodoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 待办事项 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class TodoServiceImpl extends ServiceImpl<TodoMapper, Todo> implements TodoService {

}
