package com.kuebiko.cbd.bank.util;

import com.kuebiko.cbd.bank.model.Transaction;
import org.springframework.util.ObjectUtils;

import java.util.Date;

public class TransactionValidator {

    public static void validate(Transaction transaction) throws Exception{

        if(transaction==null){
            throw new Exception("Data cannot be empty");
        }

        Date date=transaction.getDate();
        if(ObjectUtils.isEmpty(date)){
            throw new Exception("Date cannot be empty");
        }

        Boolean success=transaction.getSuccessful();
        if(ObjectUtils.isEmpty(success)){
            throw new Exception("Date cannot be empty");
        }

    }
}
