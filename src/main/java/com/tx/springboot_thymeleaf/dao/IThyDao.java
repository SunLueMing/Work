package com.tx.springboot_thymeleaf.dao;

import com.tx.springboot_thymeleaf.pojo.Record;
import com.tx.springboot_thymeleaf.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: apple
 * @date: 2019-07-27 10:40
 */
public interface IThyDao {
    public String selUserName(@Param("code") String name,@Param("pwd") String pwd);
    public List<Student> selAllStu();
    public List<Record> selRecByStu(@Param("id") Integer stuid);
    public List<Record> selAllRecord();
    public Integer delRecord(@Param("did") Integer did);
}
