package com.kuebiko.cbd.bank.controller;

import com.kuebiko.cbd.bank.service.BaseService;

public abstract class BaseController {

    BaseService service;

    public BaseController(BaseService service) {
        this.service = service;
    }

    public BaseService getService(){
        return this.service;
    }
}
