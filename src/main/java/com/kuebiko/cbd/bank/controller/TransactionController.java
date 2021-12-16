package com.kuebiko.cbd.bank.controller;


import com.kuebiko.cbd.bank.model.Transaction;
import com.kuebiko.cbd.bank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Transaction> saveTransaction(@RequestBody Transaction payload){
        Transaction response=new Transaction();
        try {
            response= (Transaction) getService().save(payload);
        } catch (Exception e) {
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping
    @RequestMapping("/find")
    public Transaction findTransaction(@RequestBody Long userId){

        return (Transaction) getService().find(userId);
    }
}
