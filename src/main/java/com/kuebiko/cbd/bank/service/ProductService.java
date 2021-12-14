package com.kuebiko.cbd.bank.service;

import com.kuebiko.cbd.bank.dao.Dao;
import com.kuebiko.cbd.bank.dao.ProductDao;
import com.kuebiko.cbd.bank.model.Payment;
import com.kuebiko.cbd.bank.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseService<Product,Product> {

    @Autowired
    ProductService(ProductDao productDao){
        super(productDao);
    }


    @Override
    public Product find(Long productId, Long userId) {
        return null;
    }

    @Override
    public Product save(Product data) {

        return (Product)dao.save(data);
    }

    @Override
    public Product find(Long productId) {
        Product product=(Product)dao.find(productId);
        return product;
    }

}
