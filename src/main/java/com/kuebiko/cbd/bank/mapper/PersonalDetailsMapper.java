package com.kuebiko.cbd.bank.mapper;

import com.kuebiko.cbd.bank.entity.PersonalDetailsEntity;
import com.kuebiko.cbd.bank.model.PersonalDetails;

public class PersonalDetailsMapper {

    public static PersonalDetailsEntity map(PersonalDetails personalDetails){

        if(personalDetails==null){
            return null;
        }

        PersonalDetailsEntity personalDetailsEntity=new PersonalDetailsEntity();

        personalDetailsEntity.setDob(personalDetails.getDob());
        personalDetailsEntity.setEmail(personalDetails.getEmail());
        personalDetailsEntity.setGender(personalDetails.getGender());
        personalDetailsEntity.setFirstName(personalDetails.getFirstName());
        personalDetailsEntity.setPhoneNumber(personalDetails.getPhoneNumber());
        personalDetailsEntity.setId(personalDetails.getId());
        personalDetailsEntity.setLastName(personalDetails.getLastName());

        return personalDetailsEntity;
    }

    public static PersonalDetails map(PersonalDetailsEntity personalDetailsEntity){

        if(personalDetailsEntity==null){
            return null;
        }
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

}
