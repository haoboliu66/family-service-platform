package com.andy.service.impl;

import com.andy.bean.VoteData;
import com.andy.mapper.VoteDataMapper;
import com.andy.service.base.VoteDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 投票数据表 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class VoteDataServiceImpl extends ServiceImpl<VoteDataMapper, VoteData> implements VoteDataService {

}
