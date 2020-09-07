package com.andy.service.impl;

import com.andy.bean.GroupsUser;
import com.andy.mapper.GroupsUserMapper;
import com.andy.service.base.GroupsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分组用户 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class GroupsUserServiceImpl extends ServiceImpl<GroupsUserMapper, GroupsUser> implements GroupsUserService {

}
