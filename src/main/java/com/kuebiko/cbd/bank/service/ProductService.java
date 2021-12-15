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
    public Product find(Long paymentId, Long userId) {
        return null;
    }

    @Override
    public Product find(Long id) {
        return null;
    }

    @Override
    public Product save(Product data) {
        dao.save(data);
        return null;
    }

}
