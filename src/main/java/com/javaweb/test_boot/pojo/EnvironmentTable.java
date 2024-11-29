package com.javaweb.test_boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;    // 引入lombok

@Data    // 注解Data，生成get、set方法
@AllArgsConstructor    // 注解AllArgsConstructor，生成全参构造方法
@NoArgsConstructor    // 注解NoArgsConstructor，生成无参构造方法

public class EnvironmentTable {    // 环境表，与对应的表建立映射实体类

    private int ID;                 // 主键
    private String date;            // 日期
    private String temperature;     //温度
    private String humidity;       // 湿度
    private String light;          // 光照
}
