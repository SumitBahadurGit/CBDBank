package com.kuebiko.cbd.bank.controller;

import com.kuebiko.cbd.bank.model.Transaction;
import com.kuebiko.cbd.bank.service.BaseService;
import com.kuebiko.cbd.bank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class TransactionController extends BaseController {

    @Autowired
    TransactionController(TransactionService transactionService){
        super(transactionService);
    }
    @GetMapping
    @RequestMapping("/find")
    public Transaction find (@RequestParam Long paymentId,
                           @RequestParam Long userId){
        getService().find(paymentId,userId);
        return new Transaction();
    }
}
