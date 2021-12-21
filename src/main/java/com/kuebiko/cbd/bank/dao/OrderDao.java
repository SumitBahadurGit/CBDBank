package com.kuebiko.cbd.bank.dao;

import com.kuebiko.cbd.bank.entity.OrderEntity;
import com.kuebiko.cbd.bank.mapper.OrderMapper;
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

        OrderEntity orderEntity = OrderMapper.map(order);
        orderEntity = orderRepo.save(orderEntity);

        Order returnOrder = OrderMapper.map(orderEntity);
        return returnOrder;
    }

    @Override
    public Order find(Long id) {
        OrderEntity orderEntity = orderRepo.getById(id);

        Order returnOrder = OrderMapper.map(orderEntity);

        return returnOrder;
    }
}
