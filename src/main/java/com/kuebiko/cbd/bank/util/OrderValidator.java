package com.kuebiko.cbd.bank.util;

import com.kuebiko.cbd.bank.model.Order;
import org.springframework.util.ObjectUtils;

import java.util.Date;

public class OrderValidator {

    public static void validate(Order order) throws Exception{

        if(order==null)
            throw new Exception("Data cannot be empty");

        String product = order.getProduct();
        if(ObjectUtils.isEmpty(product))
            throw new Exception("Order cannnot be empty");

        Integer quantity = order.getQuantity();
        if(ObjectUtils.isEmpty(quantity))
            throw new Exception("Quantity cannot be empty");

        Long orderBy = order.getOrderBy();
        if(ObjectUtils.isEmpty(orderBy))
            throw new Exception("OrderBy cannot be empty");

        Date orderDate = order.getOrderDate();
        if(ObjectUtils.isEmpty(orderDate))
            throw new Exception("OrderDate cannot be empty");

        Double price = order.getPrice();
        if(ObjectUtils.isEmpty(price))
            throw new Exception("price cannot be empty");

        Double sales = order.getSales();
        if(ObjectUtils.isEmpty(sales))
            throw new Exception("sales cannot be empty");

        Double tax = order.getSales();
        if(ObjectUtils.isEmpty(tax))
            throw new Exception("tax cannot be empty");

    }
}
