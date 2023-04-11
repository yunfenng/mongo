package com.lagou.bean;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @Author: Jaa
 * @Date: 2023/4/11 8:28
 * @Description:
 */
@Data
@Document("lg_resume_datas")
public class Resume {
    private String id;
    private String name;
    private String city;
    private Date birthday;
    private double expectSalary;
}
