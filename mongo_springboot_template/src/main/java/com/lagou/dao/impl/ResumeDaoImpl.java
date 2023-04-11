package com.lagou.dao.impl;

import com.lagou.bean.Resume;
import com.lagou.dao.ResumeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Jaa
 * @Date: 2023/4/11 8:35
 * @Description:
 */
@Repository("resumeDao")
public class ResumeDaoImpl implements ResumeDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insertResume(Resume resume) {
        // mongoTemplate.insert(resume);
        mongoTemplate.insert(resume, "lg_resume_datas");
    }

    @Override
    public Resume findByName(String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(name));
        List<Resume> resumes = mongoTemplate.find(query, Resume.class, "lg_resume_datas");
        return resumes.isEmpty() ? null : resumes.get(0);
    }

    @Override
    public List<Resume> findList(String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(name));
        return mongoTemplate.find(query, Resume.class, "lg_resume_datas");
    }

    @Override
    public List<Resume> find(String name, double expectSalary) {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(name).andOperator(Criteria.where("expectSalary").is(expectSalary)));
        return mongoTemplate.find(query, Resume.class, "lg_resume_datas");
    }
}
