package com.kuebiko.cbd.bank.dao;

import com.kuebiko.cbd.bank.model.Payment;
import org.springframework.stereotype.Component;

@Component
public class ProductDao extends Dao<Payment>{

    @Override
    public Payment save(Payment payment) {
        return null;
    }

    @Override
    public Payment find(Long id) {
        return null;
    }
}
