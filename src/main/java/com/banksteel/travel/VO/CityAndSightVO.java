package com.banksteel.travel.VO;

import com.banksteel.travel.entity.City;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:zfsn
 * @date:2021/02/27
 * @time:17:28
 * @formattingCode:ctrl+alt+l
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityAndSightVO {

    private String cityName;

    private String sightName;

}
