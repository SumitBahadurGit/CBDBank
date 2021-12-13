package com.kuebiko.cbd.bank.dao;


import com.kuebiko.cbd.bank.entity.PersonalDetailsEntity;
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

        PersonalDetailsEntity personalDetailsEntity=new PersonalDetailsEntity();

        personalDetailsEntity.setDob(personalDetails.getDob());
        personalDetailsEntity.setEmail(personalDetails.getEmail());
        personalDetailsEntity.setGender(personalDetails.getGender());
        personalDetailsEntity.setFirstName(personalDetails.getFirstName());
        personalDetailsEntity.setPhoneNumber(personalDetails.getPhoneNumber());
        personalDetailsEntity.setId(personalDetails.getId());
        personalDetailsEntity.setLastName(personalDetails.getLastName());

        PersonalDetails newPersonalDetails=new PersonalDetails();
        newPersonalDetails.setDob(personalDetailsEntity.getDob());
        newPersonalDetails.setEmail(personalDetailsEntity.getEmail());
        newPersonalDetails.setId(personalDetailsEntity.getId());
        newPersonalDetails.setGender(personalDetailsEntity.getGender());
        newPersonalDetails.setFirstName(personalDetailsEntity.getFirstName());
        newPersonalDetails.setLastName(personalDetailsEntity.getLastName());
        newPersonalDetails.setDob(personalDetailsEntity.getDob());

        return newPersonalDetails;

    }

    @Override
    public PersonalDetails find(Long id) {
        PersonalDetailsEntity personalDetailsEntity=personalDetailsRepo.getById(id);

        PersonalDetails personalDetails=new PersonalDetails();

        personalDetails.setDob(personalDetailsEntity.getDob());
        personalDetails.setGender(personalDetailsEntity.getGender());
        personalDetails.setLastName(personalDetailsEntity.getLastName());
        personalDetails.setEmail(personalDetailsEntity.getEmail());
        personalDetails.setId(personalDetailsEntity.getId());
        personalDetails.setFirstName(personalDetailsEntity.getFirstName());
        personalDetails.setPhoneNumber(personalDetailsEntity.getPhoneNumber());

        return  personalDetails;
    }

}
