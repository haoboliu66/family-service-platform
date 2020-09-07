package com.andy.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 用户角色表
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@TableName("tbl_user_role")
public class UserRole implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户编号
     */
    private String userId;

    /**
     * 角色编号
     */
    private Integer roleId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
        "userId=" + userId +
        ", roleId=" + roleId +
        "}";
    }
}
