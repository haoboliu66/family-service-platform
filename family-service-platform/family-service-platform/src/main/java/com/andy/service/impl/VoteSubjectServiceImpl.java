package com.andy.service.impl;

import com.andy.bean.VoteSubject;
import com.andy.mapper.VoteSubjectMapper;
import com.andy.service.base.VoteSubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 投票题目表 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class VoteSubjectServiceImpl extends ServiceImpl<VoteSubjectMapper, VoteSubject> implements VoteSubjectService {

}
