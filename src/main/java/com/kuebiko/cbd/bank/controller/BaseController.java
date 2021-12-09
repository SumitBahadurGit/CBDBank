package com.kuebiko.cbd.bank.controller;

import com.kuebiko.cbd.bank.service.BaseService;
import com.kuebiko.cbd.bank.service.PaymentService;

public abstract class BaseController {

    BaseService service;

    public BaseController(BaseService service) {
        this.service = service;
    }

    public BaseService getService(){
        return this.service;
    }
}
