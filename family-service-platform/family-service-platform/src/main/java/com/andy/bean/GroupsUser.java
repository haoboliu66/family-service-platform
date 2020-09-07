package com.andy.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 分组用户
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@TableName("tbl_groups_user")
public class GroupsUser implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 分组id
     */
    private Integer groupId;

    /**
     * 对象id
     */
    private String objId;

    /**
     * 绑定类型
     */
    private Integer objType;


    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public Integer getObjType() {
        return objType;
    }

    public void setObjType(Integer objType) {
        this.objType = objType;
    }

    @Override
    public String toString() {
        return "GroupsUser{" +
        "groupId=" + groupId +
        ", objId=" + objId +
        ", objType=" + objType +
        "}";
    }
}
