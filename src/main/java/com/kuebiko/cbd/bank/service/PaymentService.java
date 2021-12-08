package com.kuebiko.cbd.bank.service;

import com.kuebiko.cbd.bank.dao.Dao;
import com.kuebiko.cbd.bank.dao.PaymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService extends BaseService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Dao getDao() {
        return paymentDao;
    }
}
