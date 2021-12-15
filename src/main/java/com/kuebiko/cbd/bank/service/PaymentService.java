package com.kuebiko.cbd.bank.service;

import com.kuebiko.cbd.bank.dao.Dao;
import com.kuebiko.cbd.bank.dao.PaymentDao;
import com.kuebiko.cbd.bank.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService extends BaseService<Payment,Payment> {

    private Long paymentId;
    private Long userId;

    @Autowired
    PaymentService(PaymentDao paymentDao){
        super(paymentDao);
    }


    @Override
    public Payment find(Long paymentId, Long userId) {
        return null;
    }

    @Override
    public Payment find(Long id) {
        return null;
    }

    @Override
    public Payment save(Payment data) {

        return (Payment) dao.save(data);
    }


}
