package com.kuebiko.cbd.bank.controller;

import com.kuebiko.cbd.bank.model.Product;
import com.kuebiko.cbd.bank.service.BaseService;
import com.kuebiko.cbd.bank.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Product> saveValue(@RequestBody Product item){
        Product response=new Product();
        try {
            response=(Product)getService().save(item);
        } catch (Exception e) {
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping
    @RequestMapping("/find")
    public Product findProduct(@RequestParam Long productId){
        return (Product)getService().find(productId);
    }

}
