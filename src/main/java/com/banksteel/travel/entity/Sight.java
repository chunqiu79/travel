package com.banksteel.travel.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tbl_sight")
public class Sight implements Serializable {
    private Integer id;

    private String name;

    private String picture;

    private String address;

    private String description;

    private Integer ticketPrice;

    private String openTime;

    private Integer cityId;

    private Integer commentId;

    private Integer detailId;

}