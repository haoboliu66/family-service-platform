package com.andy.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 工作日期
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@TableName("tbl_work_date")
public class WorkDate implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 日期
     */
    private LocalDateTime dt;

    /**
     * 星期
     */
    private Integer weekday;

    /**
     * 是否上班
     */
    private Integer isWork;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDt() {
        return dt;
    }

    public void setDt(LocalDateTime dt) {
        this.dt = dt;
    }

    public Integer getWeekday() {
        return weekday;
    }

    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
    }

    public Integer getIsWork() {
        return isWork;
    }

    public void setIsWork(Integer isWork) {
        this.isWork = isWork;
    }

    @Override
    public String toString() {
        return "WorkDate{" +
        "id=" + id +
        ", dt=" + dt +
        ", weekday=" + weekday +
        ", isWork=" + isWork +
        "}";
    }
}
