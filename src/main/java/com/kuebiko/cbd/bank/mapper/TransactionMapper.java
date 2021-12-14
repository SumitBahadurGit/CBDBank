package com.kuebiko.cbd.bank.mapper;

import com.kuebiko.cbd.bank.entity.TransactionEntity;
import com.kuebiko.cbd.bank.model.Transaction;

public class TransactionMapper {
    public static TransactionEntity map(Transaction transaction){
        if (transaction == null){
            return null;
        }
        TransactionEntity transactionEntity = new TransactionEntity();

        transactionEntity.setInvoice(transaction.getInvoice());
        transactionEntity.setSuccessful(transaction.getSuccessful());
        transactionEntity.setDate(transaction.getDate());

        return transactionEntity;
    }

    public static Transaction map(TransactionEntity transactionEntity){

        if(transactionEntity == null){
            return null;
        }

        Transaction newTransaction = new Transaction();

        newTransaction.setInvoice(transactionEntity.getInvoice());
        newTransaction.setDate(transactionEntity.getDate());
        newTransaction.setSuccessful(transactionEntity.getSuccessful());

        return newTransaction;
    }
}
