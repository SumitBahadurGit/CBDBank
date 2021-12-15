package com.kuebiko.cbd.bank.dao;


import com.kuebiko.cbd.bank.entity.PersonalDetailsEntity;
import com.kuebiko.cbd.bank.mapper.PersonalDetailsMapper;
import com.kuebiko.cbd.bank.model.PersonalDetails;
import com.kuebiko.cbd.bank.repo.PersonalDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao extends Dao<PersonalDetails>{

    @Autowired
    private PersonalDetailsRepo personalDetailsRepo;

    @Override
    public PersonalDetails save(PersonalDetails personalDetails) {

        PersonalDetailsEntity personalDetailsEntity= PersonalDetailsMapper.map(personalDetails);

        personalDetailsEntity=personalDetailsRepo.save(personalDetailsEntity);

        return PersonalDetailsMapper.map(personalDetailsEntity);

    }

    @Override
    public PersonalDetails find(Long id) {
        PersonalDetailsEntity personalDetailsEntity=personalDetailsRepo.getById(id);

        return  PersonalDetailsMapper.map(personalDetailsEntity);
    }

}
