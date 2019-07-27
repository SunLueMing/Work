package com.tx.springboot_thymeleaf.biz;

import com.tx.springboot_thymeleaf.dao.IThyDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @description:
 * @author: apple
 * @date: 2019-07-27 23:00
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)

public class ThyBiz {
    @Resource
    private IThyDao thyDao;

}
