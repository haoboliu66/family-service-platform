package com.andy.mapper;

import com.andy.bean.UserRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户档案 Mapper 接口
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@Repository
public interface UserRecordMapper extends BaseMapper<UserRecord> {

    public UserRecord login(@Param("username") String username, @Param("password")String password);
}
