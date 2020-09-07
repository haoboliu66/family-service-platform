package com.andy.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 常用短信
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@TableName("tbl_common_message")
public class CommonMessage implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 短信编码
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 短信内容
     */
    private String messageContent;

    /**
     * 类型
     */
    private Long messageType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Long getMessageType() {
        return messageType;
    }

    public void setMessageType(Long messageType) {
        this.messageType = messageType;
    }

    @Override
    public String toString() {
        return "CommonMessage{" +
        "id=" + id +
        ", messageContent=" + messageContent +
        ", messageType=" + messageType +
        "}";
    }
}
