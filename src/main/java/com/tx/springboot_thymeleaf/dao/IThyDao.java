package com.tx.springboot_thymeleaf.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: apple
 * @date: 2019-07-27 10:40
 */
public interface IThyDao {
    public String selUserName(@Param("code") String name,@Param("pwd") String pwd);
}
