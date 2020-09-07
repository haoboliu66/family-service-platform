package com.andy.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 数据库还原
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@TableName("tbl_dbrecovery")
public class Dbrecovery implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 还原数据库名
     */
    private String dbName;

    /**
     * 还原路径
     */
    private String dbUrl;

    /**
     * 操作人id
     */
    private String operateId;

    /**
     * 操作人姓名
     */
    private String operatePerson;

    /**
     * 操作时间
     */
    private LocalDateTime operateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getOperateId() {
        return operateId;
    }

    public void setOperateId(String operateId) {
        this.operateId = operateId;
    }

    public String getOperatePerson() {
        return operatePerson;
    }

    public void setOperatePerson(String operatePerson) {
        this.operatePerson = operatePerson;
    }

    public LocalDateTime getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(LocalDateTime operateDate) {
        this.operateDate = operateDate;
    }

    @Override
    public String toString() {
        return "Dbrecovery{" +
        "id=" + id +
        ", dbName=" + dbName +
        ", dbUrl=" + dbUrl +
        ", operateId=" + operateId +
        ", operatePerson=" + operatePerson +
        ", operateDate=" + operateDate +
        "}";
    }
}
