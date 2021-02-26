package com.banksteel.travel.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tbl_restaurant")
public class Restaurant implements Serializable {
    private Integer id;

    private String name;

    private Integer price;

}