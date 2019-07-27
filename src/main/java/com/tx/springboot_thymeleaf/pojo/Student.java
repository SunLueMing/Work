package com.tx.springboot_thymeleaf.pojo;

import java.util.Date;

/**
 * @description:
 * @author: apple
 * @date: 2019-07-27 22:42
 */
public class Student {
    private Integer id;
    private String code;
    private String name;
    private Integer major;
    private String grade;
    private Integer sex;
    private Date birthday;
    private Integer tel;
    private Integer job;
    private String pwd;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", major=" + major +
                ", grade='" + grade + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", tel=" + tel +
                ", job=" + job +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public Integer getJob() {
        return job;
    }

    public void setJob(Integer job) {
        this.job = job;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Student() {
    }
}
