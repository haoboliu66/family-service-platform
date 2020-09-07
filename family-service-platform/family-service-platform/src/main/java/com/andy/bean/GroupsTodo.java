package com.andy.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 分组待办事项
 * </p>
 *
 * @author andy-liu
 * @since 2020-06-01
 */
@TableName("tbl_groups_todo")
public class GroupsTodo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 分组id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 待办事项id
     */
    private String todoId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTodoId() {
        return todoId;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }

    @Override
    public String toString() {
        return "GroupsTodo{" +
        "id=" + id +
        ", todoId=" + todoId +
        "}";
    }
}
