package com.andy.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 仪表盘
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@TableName("tbl_dashboard")
public class Dashboard implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 数据项
     */
    private String dataItem;

    /**
     * 更多地址
     */
    private String morePath;

    /**
     * 权限
     */
    private String privileges;

    /**
     * 状态
     */
    @TableField("Status")
    private String Status;

    /**
     * 所属产品
     */
    private String belongProduct;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataItem() {
        return dataItem;
    }

    public void setDataItem(String dataItem) {
        this.dataItem = dataItem;
    }

    public String getMorePath() {
        return morePath;
    }

    public void setMorePath(String morePath) {
        this.morePath = morePath;
    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getBelongProduct() {
        return belongProduct;
    }

    public void setBelongProduct(String belongProduct) {
        this.belongProduct = belongProduct;
    }

    @Override
    public String toString() {
        return "Dashboard{" +
        "id=" + id +
        ", dataItem=" + dataItem +
        ", morePath=" + morePath +
        ", privileges=" + privileges +
        ", Status=" + Status +
        ", belongProduct=" + belongProduct +
        "}";
    }
}
