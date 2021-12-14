package com.kuebiko.cbd.bank.service;

import com.kuebiko.cbd.bank.dao.Dao;
import com.kuebiko.cbd.bank.dao.TransactionDao;
import com.kuebiko.cbd.bank.dao.UserDao;
import com.kuebiko.cbd.bank.model.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends BaseService<Transaction, Transaction> {

    @Autowired
    TransactionService(TransactionDao transactionDao){
        super(transactionDao);
    }

    @Override
    public Transaction find(Long paymentId, Long userId) {

        return null;
    }

    @Override
    public Transaction save(Transaction data) {
        return (Transaction) dao.save(data);
    }

    @Override
    public Transaction find(Long userId) {
        return (Transaction)dao.find(userId);
    }
}
