package com.kuebiko.cbd.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController
{
    @GetMapping("/product")
    public String getProductInfo()
    {
        return null;
    }
}