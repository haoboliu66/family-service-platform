package com.andy.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 投票数据明细表
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@TableName("tbl_vote_detail")
public class VoteDetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 投票编号
     */
    private Integer voteId;

    /**
     * 答案编号
     */
    private Integer answerId;

    /**
     * 答案
     */
    private String result;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "VoteDetail{" +
        "id=" + id +
        ", voteId=" + voteId +
        ", answerId=" + answerId +
        ", result=" + result +
        "}";
    }
}
