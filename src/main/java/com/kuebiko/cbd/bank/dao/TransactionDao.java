package com.kuebiko.cbd.bank.dao;

import com.kuebiko.cbd.bank.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionDao extends Dao<Transaction> {

    @Override
    public Transaction save(Transaction payment) {
        return null;
    }
}
