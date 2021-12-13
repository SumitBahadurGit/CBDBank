package com.kuebiko.cbd.bank.dao;

import com.kuebiko.cbd.bank.entity.PaymentEntity;
import com.kuebiko.cbd.bank.model.Payment;
import com.kuebiko.cbd.bank.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentDao extends Dao<Payment>{

    @Autowired
    private PaymentRepo paymentRepo;


    @Override
    public Payment save(Payment payment) {

        PaymentEntity entity = new PaymentEntity();
        entity.setAmount((payment.getAmount()));
        entity.setId(payment.getId());
        entity.setTransactionDate(payment.getTransactionDate());
        entity.setType(payment.getType());
        entity.setUserId(payment.getUserId());

        entity = paymentRepo.save(entity);
        Payment response = new Payment();
        return response;
    }
}

