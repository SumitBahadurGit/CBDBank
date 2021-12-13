package com.kuebiko.cbd.bank.service;

import com.kuebiko.cbd.bank.dao.BaseDaoIf;
import com.kuebiko.cbd.bank.dao.Dao;
import com.kuebiko.cbd.bank.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseService <U,V> implements BaseServiceIf <U,V>{

    protected Dao dao;


    public BaseService(Dao baseDao) {

        this.dao=baseDao;
    }



}
