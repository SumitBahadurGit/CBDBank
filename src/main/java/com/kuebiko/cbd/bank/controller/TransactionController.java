package com.kuebiko.cbd.bank.controller;


import com.kuebiko.cbd.bank.model.Transaction;
import com.kuebiko.cbd.bank.service.BaseService;
import com.kuebiko.cbd.bank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class TransactionController extends BaseController {

    @Autowired
   public TransactionController(TransactionService transactionService) {
        super(transactionService);

    }

        @GetMapping
        @RequestMapping("/find")
        public Transaction findUser(@RequestParam long transactionId){

            return (Transaction) getService().find(transactionId);
        }

        public Transaction saveTransaction(@RequestBody Transaction transactionLoad){

            return(Transaction) getService().save(transactionLoad);
        }
}
