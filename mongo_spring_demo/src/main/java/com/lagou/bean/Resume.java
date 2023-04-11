package com.lagou.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author: Jaa
 * @Date: 2023/4/11 8:28
 * @Description:
 */
@Data
public class Resume {
    private String id;
    private String name;
    private String city;
    private Date birthday;
    private double expectSalary;
}
