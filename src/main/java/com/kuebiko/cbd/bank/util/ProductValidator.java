package com.kuebiko.cbd.bank.util;

import com.kuebiko.cbd.bank.model.Product;
import org.springframework.util.ObjectUtils;

public class ProductValidator
{
    public static void validate (Product pd) throws Exception{
        if (pd==null){
            throw new Exception("Data cannot be empty");
        }

        String name=pd.getName();
        if(ObjectUtils.isEmpty(name)){
            throw new Exception("name cannot be empty");
        }

        Boolean inStock=pd.getInStock();
        if(ObjectUtils.isEmpty(inStock)){
            throw new Exception("in stock value cannot be empty");
        }

        Double prize=pd.getPrize();
        if(ObjectUtils.isEmpty(prize)){
            throw new Exception("Prize value cannot be empty");
        }
    }
}
