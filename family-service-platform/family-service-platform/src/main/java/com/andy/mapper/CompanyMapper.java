package com.andy.mapper;

import com.andy.bean.Company;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 企业档案 Mapper 接口
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */

@Repository
public interface CompanyMapper extends BaseMapper<Company> {

    List<Company> selectCompany();
}

