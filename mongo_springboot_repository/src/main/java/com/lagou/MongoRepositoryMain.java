package com.lagou;

import com.lagou.repository.ResumeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @Author: Jaa
 * @Date: 2023/4/11 15:45
 * @Description:
 */
@SpringBootApplication
public class MongoRepositoryMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MongoRepositoryMain.class, args);
        ResumeRepository resumeRepository = applicationContext.getBean(ResumeRepository.class);
        System.out.println(resumeRepository.findAll());
        System.out.println(resumeRepository.findByNameEquals("Jack"));
        System.out.println(resumeRepository.findByNameAndExpectSalary("Jack", 18000));
    }
}
