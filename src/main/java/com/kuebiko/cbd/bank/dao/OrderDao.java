package com.kuebiko.cbd.bank.dao;

import com.kuebiko.cbd.bank.entity.OrderEntity;
import com.kuebiko.cbd.bank.model.Order;
import com.kuebiko.cbd.bank.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Component
public class OrderDao extends Dao<Order>{

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public Order save(Order order) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderId(order.getOrderId());
        orderEntity.setOrderBy(order.getOrderBy());
        orderEntity.setOrderDate(order.getOrderDate());
        orderEntity.setPrice(order.getPrice());
        orderEntity.setProduct(order.getProduct());
        orderEntity.setQuantity(order.getQuantity());
        orderEntity.setSales(order.getSales());
        orderEntity.setTax(order.getTax());

        orderEntity = orderRepo.save(orderEntity);

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

    @Override
    public Order find(Long id) {
        OrderEntity orderEntity = orderRepo.getById(id);

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
