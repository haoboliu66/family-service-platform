package com.andy.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 用户子公司表
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@TableName("tbl_user_sub_company")
public class UserSubCompany implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 子公司编号
     */
    private Integer companyId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "UserSubCompany{" +
        "userId=" + userId +
        ", companyId=" + companyId +
        "}";
    }
}
