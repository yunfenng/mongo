package com.lagou;

import com.lagou.bean.Resume;
import com.lagou.dao.ResumeDAO;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author: Jaa
 * @Date: 2023/4/11 8:41
 * @Description:
 */
@SpringBootApplication
public class MongoTemplateMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MongoTemplateMain.class, args);
        ResumeDAO resumeDao = applicationContext.getBean("resumeDao", ResumeDAO.class);
        List<Resume> resumeList = resumeDao.find("James", 40000000);
        resumeList.forEach(resume -> {
            System.out.println(resume);
        });
    }

    /*@Test
    public void testInsertResume() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ResumeDAO resumeDao = applicationContext.getBean("resumeDao", ResumeDAO.class);
        Resume resume = new Resume();
        resume.setName("Tom");
        resume.setCity("北京");
        Date date = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            date = simpleDateFormat.parse("2001-01-01 11:13:14");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        resume.setBirthday(date);
        resume.setExpectSalary(28000);
        resumeDao.insertResume(resume);
    }

    @Test
    public void testFindResume() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ResumeDAO resumeDao = applicationContext.getBean("resumeDao", ResumeDAO.class);
        Resume resume = resumeDao.findByName("Tom");
        System.out.println(resume);
    }

    @Test
    public void testFindList() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ResumeDAO resumeDao = applicationContext.getBean("resumeDao", ResumeDAO.class);
        List<Resume> resumeList = resumeDao.findList("Jack");
        resumeList.forEach(resume -> {
            System.out.println(resume);
        });
    }

    @Test
    public void testFind() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ResumeDAO resumeDao = applicationContext.getBean("resumeDao", ResumeDAO.class);
        List<Resume> resumeList = resumeDao.find("James", 40000000);
        resumeList.forEach(resume -> {
            System.out.println(resume);
        });
    }*/
}
