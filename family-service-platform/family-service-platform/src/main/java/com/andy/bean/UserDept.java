package com.andy.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 用户部门表
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@TableName("tbl_user_dept")
public class UserDept implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 部门编号
     */
    private Integer deptId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "UserDept{" +
        "userId=" + userId +
        ", deptId=" + deptId +
        "}";
    }
}
