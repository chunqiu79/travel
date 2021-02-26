package com.banksteel.travel.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tbl_order")
public class Order implements Serializable {
    private Integer id;

    private Integer wayId;

    private Integer hotelId;

    private Integer restaurantId;

    private Integer sightId;

}