package com.banksteel.travel.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tbl_comment")
public class Comment implements Serializable {
    private Integer id;

    private Integer userId;

    private String commentContent;

    private Boolean score;

    private String time;

}