package com.kuebiko.cbd.bank.service;

import com.kuebiko.cbd.bank.dao.Dao;
import com.kuebiko.cbd.bank.dao.UserDao;
import com.kuebiko.cbd.bank.model.PersonalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDetailService extends BaseService<PersonalDetails,PersonalDetails>{

    @Autowired
    PersonalDetailService(UserDao userdao){
        super(userdao);
    }

    @Override
    public void find(Long paymentId, Long userId) {

    }

    @Override
    public PersonalDetails save(PersonalDetails data) {
        return null;
    }


}
