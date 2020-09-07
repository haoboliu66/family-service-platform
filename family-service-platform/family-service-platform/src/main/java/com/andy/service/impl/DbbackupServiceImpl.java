package com.andy.service.impl;

import com.andy.bean.Dbbackup;
import com.andy.mapper.DbbackupMapper;
import com.andy.service.base.DbbackupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据库备份 服务实现类
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Service
public class DbbackupServiceImpl extends ServiceImpl<DbbackupMapper, Dbbackup> implements DbbackupService {

}
