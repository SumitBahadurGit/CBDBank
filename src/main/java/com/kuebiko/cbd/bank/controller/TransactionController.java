package com.kuebiko.cbd.bank.controller;


import com.kuebiko.cbd.bank.model.Transaction;
import com.kuebiko.cbd.bank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class TransactionController extends BaseController{

    @Autowired
    public TransactionController(TransactionService transactionService){
        super(transactionService);

    }

    @PostMapping
    @RequestMapping("/save")
    public Transaction saveTransaction(@RequestBody Transaction payload){
        return (Transaction) getService().save(payload);
    }

    @GetMapping
    @RequestMapping("/find")
    public Transaction findTransaction(@RequestBody Long userId){

        return (Transaction) getService().find(userId);
    }
}
