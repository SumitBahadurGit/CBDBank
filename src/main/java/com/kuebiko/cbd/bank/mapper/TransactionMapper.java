package com.kuebiko.cbd.bank.mapper;

import com.kuebiko.cbd.bank.entity.TransactionEntity;
import com.kuebiko.cbd.bank.model.Transaction;

public class TransactionMapper {

    public static TransactionEntity map(Transaction transaction){

        if(transaction == null){
            return null;
        }

        TransactionEntity transactionEntity = new TransactionEntity();

        transactionEntity.setUserId(transaction.getUserId());
        transactionEntity.setInvoice(transaction.getInvoice());
        transactionEntity.setDate(transaction.getDate());
        transactionEntity.setSuccessful(transaction.isSuccessful());

        return transactionEntity;

    }

    public static Transaction map(TransactionEntity transactionEntity){

        if(transactionEntity == null){
            return null;
        }
        Transaction transaction= new Transaction();

        transaction.setUserId(transactionEntity.getUserId());
        transaction.setInvoice(transactionEntity.getInvoice());
        transaction.setDate(transactionEntity.getDate());
        transaction.setSuccessful(transactionEntity.isSuccessful());

        return transaction;
    }
}
