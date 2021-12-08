package com.kuebiko.cbd.bank.controller;

import com.kuebiko.cbd.bank.model.Payment;
import com.kuebiko.cbd.bank.service.BaseService;
import com.kuebiko.cbd.bank.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController extends BaseController {

    @Autowired
    private PaymentService paymentService;

    @Override
    public BaseService getService() {
        return paymentService;
    }

    @GetMapping
    @RequestMapping("/find")
    public Payment find(@RequestParam Long paymentId,
                        @RequestParam Long userId){
        return new Payment();
    }

}
