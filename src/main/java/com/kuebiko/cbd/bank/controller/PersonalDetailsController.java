package com.kuebiko.cbd.bank.controller;

import com.kuebiko.cbd.bank.model.Payment;
import com.kuebiko.cbd.bank.model.PersonalDetails;
import com.kuebiko.cbd.bank.service.BaseService;
import com.kuebiko.cbd.bank.service.PersonalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/details")
public class PersonalDetailsController extends BaseController {

    @Autowired
    public PersonalDetailsController(PersonalDetailService personalDetailService) {
        super(personalDetailService);
    }

    @PostMapping
    @RequestMapping("/save")
    public PersonalDetails saveOrder(@RequestBody PersonalDetails payload){
        return (PersonalDetails) getService().save(payload);
    }

    @GetMapping
    @RequestMapping("/find")
    public PersonalDetails findUser(@RequestParam Long userId){

        return (PersonalDetails) getService().find(userId);
    }
}
