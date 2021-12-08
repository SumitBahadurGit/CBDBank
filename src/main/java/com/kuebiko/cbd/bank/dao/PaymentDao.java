package com.kuebiko.cbd.bank.dao;

import com.kuebiko.cbd.bank.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentDao extends Dao{

    @Autowired
    private PaymentRepo paymentRepo;
}
