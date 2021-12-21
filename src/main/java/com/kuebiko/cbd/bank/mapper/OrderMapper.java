package com.kuebiko.cbd.bank.mapper;

import com.kuebiko.cbd.bank.entity.OrderEntity;
import com.kuebiko.cbd.bank.model.Order;

public class OrderMapper {

    public static OrderEntity map(Order order){

        if(order == null)
            return null;

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderId(order.getOrderId());
        orderEntity.setOrderBy(order.getOrderBy());
        orderEntity.setOrderDate(order.getOrderDate());
        orderEntity.setPrice(order.getPrice());
        orderEntity.setProduct(order.getProduct());
        orderEntity.setQuantity(order.getQuantity());
        orderEntity.setSales(order.getSales());
        orderEntity.setTax(order.getTax());
        return orderEntity;
    }

    public static Order map(OrderEntity orderEntity){

        if(orderEntity == null)
            return null;

        Order returnOrder = new Order();
        returnOrder.setOrderId(orderEntity.getOrderId());
        returnOrder.setOrderBy(orderEntity.getOrderBy());
        returnOrder.setOrderDate(orderEntity.getOrderDate());
        returnOrder.setPrice(orderEntity.getPrice());
        returnOrder.setProduct(orderEntity.getProduct());
        returnOrder.setQuantity(orderEntity.getQuantity());
        returnOrder.setSales(orderEntity.getSales());
        returnOrder.setTax(orderEntity.getTax());
        return returnOrder;
    }
}
