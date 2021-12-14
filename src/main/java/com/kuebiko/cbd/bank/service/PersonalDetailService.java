package com.kuebiko.cbd.bank.service;

import com.kuebiko.cbd.bank.dao.Dao;
import com.kuebiko.cbd.bank.dao.UserDao;
import com.kuebiko.cbd.bank.model.PersonalDetails;
import com.kuebiko.cbd.bank.util.PersonalDetailsValidator;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDetailService extends BaseService<PersonalDetails,PersonalDetails> {

    @Autowired
    PersonalDetailService(UserDao userDao){
        super(userDao);
    }


    @Override
    public PersonalDetails find(Long paymentId, Long userId) {
        //PersonalDetails personalDetails=(PersonalDetails) dao.find(userId);
        return null;
    }

    @Override
    public PersonalDetails save(PersonalDetails data) throws Exception {
        PersonalDetailsValidator.validate(data);
        return (PersonalDetails) dao.save(data);
    }

    @Override
    public PersonalDetails find(Long userId) {
        PersonalDetails personalDetails=(PersonalDetails) dao.find(userId);
        return personalDetails;
    }


}
