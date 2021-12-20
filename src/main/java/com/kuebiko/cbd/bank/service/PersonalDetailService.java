package com.kuebiko.cbd.bank.service;

import com.kuebiko.cbd.bank.dao.Dao;
import com.kuebiko.cbd.bank.dao.UserDao;
import com.kuebiko.cbd.bank.model.PersonalDetails;
import com.kuebiko.cbd.bank.producer.KafkaProducer;
import com.kuebiko.cbd.bank.util.PersonalDetailsValidator;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PersonalDetailService extends BaseService<PersonalDetails,PersonalDetails> {


    @Value(value = "${kafka.topic.details}")
    private String topic;

    @Autowired
    PersonalDetailService(UserDao userDao){
        super(userDao);
    }
    @Autowired
    KafkaProducer kafkaProducer;


    @Override
    public PersonalDetails find(Long paymentId, Long userId) {
        //PersonalDetails personalDetails=(PersonalDetails) dao.find(userId);
        return null;
    }

    @Override
    public PersonalDetails save(PersonalDetails data) throws Exception {
        PersonalDetailsValidator.validate(data);
        PersonalDetails personalDetails = (PersonalDetails) dao.save(data);
        kafkaProducer.send(topic, "New User has been added..");
        return personalDetails;
    }

    @Override
    public PersonalDetails find(Long userId) {
        PersonalDetails personalDetails=(PersonalDetails) dao.find(userId);
        return personalDetails;
    }


}
