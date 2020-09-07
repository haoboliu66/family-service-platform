package com.andy.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 部门key
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@TableName("tbl_deptkey")
public class Deptkey implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * Key编码
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * key名称
     */
    private String deptName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Deptkey{" +
        "id=" + id +
        ", deptName=" + deptName +
        "}";
    }
}
