package com.kuebiko.cbd.bank.service;

import com.kuebiko.cbd.bank.dao.Dao;
import com.kuebiko.cbd.bank.dao.OrderDao;
import com.kuebiko.cbd.bank.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends BaseService<Order, Order>{

    @Autowired
    public OrderService(OrderDao orderDao) {
        super(orderDao);
    }

    @Override
    public Order find(Long orderId, Long userId) {

        return null;
    }

    @Override
    public Order find(Long id) {
        Order returnOrder = (Order) dao.find(id);
        return returnOrder;
    }

    @Override
    public Order save(Order order) {
        return (Order) dao.save(order);
    }
}
