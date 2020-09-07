package com.andy.service.impl;

import com.andy.bean.UserGroup;
import com.andy.mapper.UserGroupMapper;
import com.andy.service.base.UserGroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户分组 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class UserGroupServiceImpl extends ServiceImpl<UserGroupMapper, UserGroup> implements UserGroupService {

}
