package com.kuebiko.cbd.bank.dao;

import com.kuebiko.cbd.bank.entity.TransactionEntity;
import com.kuebiko.cbd.bank.mapper.TransactionMapper;
import com.kuebiko.cbd.bank.model.Transaction;
import com.kuebiko.cbd.bank.repo.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionDao extends Dao<Transaction>{

    @Autowired
    private TransactionRepo transactionRepo;

    @Override
    public Transaction save(Transaction transaction) {

        TransactionEntity transactionEntity = TransactionMapper.map(transaction);
        transactionEntity = transactionRepo.save(transactionEntity);
        return TransactionMapper.map(transactionEntity);
    }

    @Override
    public Transaction find(Long id) {
        TransactionEntity transactionEntity = transactionRepo.getById(id);
        return TransactionMapper.map(transactionEntity);

    }
}
