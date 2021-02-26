package com.banksteel.travel.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tbl_city")
public class City implements Serializable {

    private Integer id;

    private String name;

    private Integer sightNumber;

}