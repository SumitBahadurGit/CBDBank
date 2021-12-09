package com.kuebiko.cbd.bank.service;

import com.kuebiko.cbd.bank.dao.Dao;
import org.springframework.stereotype.Service;

@Service
public class PersonalDetailService extends BaseService {
    @Override
    public Dao getDao() {
        return null;
    }

    @Override
    public void find(Long paymentId, Long userId) {

    }
}
