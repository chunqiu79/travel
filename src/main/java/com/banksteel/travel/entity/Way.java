package com.banksteel.travel.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tbl_way")
public class Way implements Serializable {

    private Integer id;

    private Integer name;

    private String description;

    private String supplier;

    private String commentId;

    private Integer ticketPrice;

}