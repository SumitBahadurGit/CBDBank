package com.kuebiko.cbd.bank.controller;

import com.kuebiko.cbd.bank.model.Payment;
import com.kuebiko.cbd.bank.model.PersonalDetails;
import com.kuebiko.cbd.bank.service.BaseService;
import com.kuebiko.cbd.bank.service.PersonalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<PersonalDetails> saveOrder(@RequestBody PersonalDetails payload)
    {
        PersonalDetails response = new PersonalDetails();
        try {
                response =  (PersonalDetails) getService().save(payload);
        } catch (Exception e) {
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping
    @RequestMapping("/find")
    public PersonalDetails findUser(@RequestParam Long userId){

        return (PersonalDetails) getService().find(userId);
    }
}
