package com.andy.service.impl;

import com.andy.bean.GroupsTodo;
import com.andy.mapper.GroupsTodoMapper;
import com.andy.service.base.GroupsTodoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分组待办事项 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class GroupsTodoServiceImpl extends ServiceImpl<GroupsTodoMapper, GroupsTodo> implements GroupsTodoService {

}
