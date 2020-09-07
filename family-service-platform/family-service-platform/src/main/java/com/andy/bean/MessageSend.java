package com.andy.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 信息发送
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@TableName("tbl_message_send")
public class MessageSend implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 内容
     */
    private String content;

    /**
     * 发送人
     */
    private String sendPerson;

    /**
     * 发送时间
     */
    private LocalDateTime sendDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendPerson() {
        return sendPerson;
    }

    public void setSendPerson(String sendPerson) {
        this.sendPerson = sendPerson;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }

    @Override
    public String toString() {
        return "MessageSend{" +
        "id=" + id +
        ", content=" + content +
        ", sendPerson=" + sendPerson +
        ", sendDate=" + sendDate +
        "}";
    }
}
