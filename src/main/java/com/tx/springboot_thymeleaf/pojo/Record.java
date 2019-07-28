package com.tx.springboot_thymeleaf.pojo;

import java.util.Date;

/**
 * @description:
 * @author: apple
 * @date: 2019-07-27 22:45
 */
public class Record {
    private Integer id;
    private String name;
    private String stuCode;
    private Date createDate;
    private String createBy;
    private String des;
    private String rewards;

    public String getRewards() {
        return rewards;
    }

    public void setRewards(String rewards) {
        this.rewards = rewards;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stuCode='" + stuCode + '\'' +
                ", createDate=" + createDate +
                ", createBy='" + createBy + '\'' +
                ", des='" + des + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuCode() {
        return stuCode;
    }

    public void setStuCode(String stuCode) {
        this.stuCode = stuCode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Record() {
    }
}
