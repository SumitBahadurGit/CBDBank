package com.kuebiko.cbd.bank.util;

import com.kuebiko.cbd.bank.model.Order;
import org.springframework.util.ObjectUtils;

import java.util.Date;

public class OrderValidator {

    public static void validate(Order or) throws Exception {

        if(or == null) {
            throw new Exception("Data cannot be empty");
        }

        String product = or.getProduct();
        if(ObjectUtils.isEmpty(product))
        {
            throw new Exception("Product cannot be empty");
        }
        Integer quantity = or.getQuantity();
        if(ObjectUtils.isEmpty(quantity))
        {
            throw new Exception("Quantity cannot be empty");
        }
        Long orderBy = or.getOrderBy();
        if(ObjectUtils.isEmpty(orderBy))
        {
            throw new Exception("OrderBy cannot be empty");
        }
        Date orderDate = or.getOrderDate();
        if(ObjectUtils.isEmpty(orderDate))
        {
            throw new Exception("Order date cannot be empty");
        }
        Double price = or.getPrice();
        if(ObjectUtils.isEmpty(price))
        {
            throw new Exception("Price cannot be empty");
        }
        Double sales = or.getSales();
        if(ObjectUtils.isEmpty(sales))
        {
            throw new Exception("Sales cannot be empty.");
        }
        Double tax = or.getTax();
        if(ObjectUtils.isEmpty(tax))
        {
            throw new Exception("Tax cannot be empty.");
        }
    }
}
