package com.lagou.dao;

import com.lagou.bean.Resume;

import java.util.List;

/**
 * @Author: Jaa
 * @Date: 2023/4/11 8:34
 * @Description:
 */
public interface ResumeDAO {
    void insertResume(Resume resume);
    // 根据 name 查询 Resume
    Resume findByName(String name);

    List<Resume> findList(String name);

    List<Resume> find(String name, double expectSalary);
}
