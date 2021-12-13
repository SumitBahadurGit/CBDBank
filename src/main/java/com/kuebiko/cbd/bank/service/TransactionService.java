package com.kuebiko.cbd.bank.service;

import com.kuebiko.cbd.bank.dao.Dao;
import com.kuebiko.cbd.bank.model.Transaction;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends BaseService<Transaction, Transaction>{
    public TransactionService(Dao baseDao) {
        super(baseDao);
    }



    @Override
    public void find(Long paymentId, Long userId) {

    }

    @Override
    public Transaction save(Transaction data) {
        return (Transaction) dao.save(data);
    }


}
