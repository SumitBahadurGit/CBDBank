package com.kuebiko.cbd.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/transaction")
public class TransactionController {

    @GetMapping("/get")
    public String getTranscationDetails(){
        return null;
    }
}


