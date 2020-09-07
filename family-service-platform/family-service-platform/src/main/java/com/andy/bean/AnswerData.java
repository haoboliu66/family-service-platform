package com.andy.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 题目可选答案信息表
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@TableName("tbl_answer_data")
public class AnswerData implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 答案编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属题目编号
     */
    private Integer subjectId;

    /**
     * 答案名称
     */
    private String answerName;

    /**
     * 答案类型
     */
    private String answerType;

    /**
     * 建档人
     */
    private String inputRecordPerson;

    /**
     * 建档时间
     */
    private LocalDateTime inputRecordDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getAnswerName() {
        return answerName;
    }

    public void setAnswerName(String answerName) {
        this.answerName = answerName;
    }

    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    public String getInputRecordPerson() {
        return inputRecordPerson;
    }

    public void setInputRecordPerson(String inputRecordPerson) {
        this.inputRecordPerson = inputRecordPerson;
    }

    public LocalDateTime getInputRecordDate() {
        return inputRecordDate;
    }

    public void setInputRecordDate(LocalDateTime inputRecordDate) {
        this.inputRecordDate = inputRecordDate;
    }

    @Override
    public String toString() {
        return "AnswerData{" +
        "id=" + id +
        ", subjectId=" + subjectId +
        ", answerName=" + answerName +
        ", answerType=" + answerType +
        ", inputRecordPerson=" + inputRecordPerson +
        ", inputRecordDate=" + inputRecordDate +
        "}";
    }
}
