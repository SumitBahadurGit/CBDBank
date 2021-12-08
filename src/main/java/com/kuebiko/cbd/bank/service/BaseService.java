package com.kuebiko.cbd.bank.service;

import com.kuebiko.cbd.bank.dao.Dao;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseService implements BaseServiceIf {

    public abstract Dao getDao();

}
