package com.kuebiko.cbd.bank.util;

import com.kuebiko.cbd.bank.model.PersonalDetails;
import org.springframework.util.ObjectUtils;

import java.util.Date;

public class PersonalDetailsValidator
{
    public static void validate(PersonalDetails pd) throws Exception {
        if(pd == null) {
            throw new Exception("Data cannot be empty");
        }

        String firstName = pd.getFirstName();
        if(ObjectUtils.isEmpty(firstName))
        {
            throw new Exception("first name cannot be empty");
        }
        String lastName = pd.getLastName();
        if(ObjectUtils.isEmpty(lastName))
        {
            throw new Exception("last name cannot be empty");
        }
        String email = pd.getEmail();
        if(ObjectUtils.isEmpty(email))
        {
            throw new Exception("email cannot be empty");
        }
        Date dob = pd.getDob();
        if(ObjectUtils.isEmpty(dob))
        {
            throw new Exception("date cannot be empty");
        }
        Long phoneNumber = pd.getPhoneNumber();
        if(ObjectUtils.isEmpty(phoneNumber))
        {
            throw new Exception("phone number cannot be empty");
        }
    }

}
