package com.kuebiko.cbd.bank.dao;


import com.kuebiko.cbd.bank.model.PersonalDetails;
import org.springframework.stereotype.Component;

@Component
public class UserDao extends Dao <PersonalDetails>{


    @Override
    public PersonalDetails save(PersonalDetails payment) {
        return null;
    }
}
