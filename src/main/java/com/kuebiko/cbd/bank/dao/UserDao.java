package com.kuebiko.cbd.bank.dao;


import com.kuebiko.cbd.bank.model.PersonalDetails;
import org.springframework.stereotype.Component;

@Component
public class UserDao extends Dao<PersonalDetails>{


    @Override
    public PersonalDetails save(PersonalDetails payment) {
        return null;
    }

    @Override
    public PersonalDetails find(Long id) {
        return null;
    }

    @Override
    public PersonalDetails find(Long id, Long userId) {
        return null;
    }
}
