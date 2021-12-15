package com.kuebiko.cbd.bank.controller;

import com.kuebiko.cbd.bank.model.Product;
import com.kuebiko.cbd.bank.service.BaseService;
import com.kuebiko.cbd.bank.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController extends BaseController{

    @Autowired
    public ProductController(ProductService productService) {
        super(productService);
    }

    @PostMapping
    @RequestMapping("/save")
    public Product saveValue(@RequestBody Product item) throws Exception {
        return (Product)getService().save(item);
    }

    @GetMapping
    @RequestMapping("/find")
    public Product findProduct(@RequestParam Long productId){
        return (Product)getService().find(productId);
    }

}
