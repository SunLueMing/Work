package com.tx.springboot_thymeleaf.biz;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tx.springboot_thymeleaf.dao.IThyDao;
import com.tx.springboot_thymeleaf.pojo.Record;
import com.tx.springboot_thymeleaf.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

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

    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public String selUserName( String name, String pwd){
        return thyDao.selUserName(name,pwd);
    }

    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public PageInfo<Student> selAllStu(Integer fir, Integer sec){
        PageHelper.startPage(fir, sec);
        return new PageInfo<>(thyDao.selAllStu());
    }


    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public List<Record> selRecByStu(Integer stuid){
        return thyDao.selRecByStu(stuid);
    }
    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public List<Record> selAllRecord(){
        return thyDao.selAllRecord();
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
    public Integer delRecord(@Param("did") Integer did){
        return thyDao.delRecord(did);
    }
}
