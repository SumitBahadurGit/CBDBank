package com.kuebiko.cbd.bank.dao;

import com.kuebiko.cbd.bank.entity.ProductEntity;
import com.kuebiko.cbd.bank.mapper.ProductMapper;
import com.kuebiko.cbd.bank.model.Payment;
import com.kuebiko.cbd.bank.model.Product;
import com.kuebiko.cbd.bank.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDao extends Dao<Product>{

    @Autowired
    ProductRepo productRepo;

    @Override
    public Product save(Product product) {
        ProductEntity productEntity=ProductMapper.map(product);
        productEntity=productRepo.save(productEntity);
        return ProductMapper.map(productEntity);

    }

    @Override
    public Product find(Long id) {
        ProductEntity productEntity= productRepo.getById(id);
        return ProductMapper.map(productEntity);

    }
}
