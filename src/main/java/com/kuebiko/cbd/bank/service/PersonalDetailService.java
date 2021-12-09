package com.kuebiko.cbd.bank.service;

import com.kuebiko.cbd.bank.dao.Dao;
import com.kuebiko.cbd.bank.dao.PaymentDao;
import com.kuebiko.cbd.bank.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDetailService extends BaseService {

    @Autowired
    private UserDao userDao;

    @Override
    public Dao getDao() {
        return userDao;
    }
}
