package com.kuebiko.cbd.bank.mapper;

import com.kuebiko.cbd.bank.entity.ProductEntity;
import com.kuebiko.cbd.bank.model.Product;

public class ProductMapper {

    public static ProductEntity map(Product product){

        if(product==null){
            return null;
        }

        ProductEntity productEntity=new ProductEntity();
        productEntity.setProductId(product.getProductId());
        productEntity.setPrize(product.getPrize());
        productEntity.setName(product.getName());
        productEntity.setInStock(product.getInStock());

        return productEntity;

    }

    public static Product map(ProductEntity productEntity){
        if(productEntity==null){
            return null;
        }

        Product newProduct=new Product();
        newProduct.setProductId(productEntity.getProductId());
        newProduct.setPrize(productEntity.getPrize());
        newProduct.setInStock(productEntity.getInStock());
        newProduct.setName(productEntity.getName());

        return newProduct;


    }
}
