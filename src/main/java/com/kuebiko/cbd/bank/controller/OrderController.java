package com.kuebiko.cbd.bank.controller;

import com.kuebiko.cbd.bank.model.Order;
import com.kuebiko.cbd.bank.service.BaseService;
import com.kuebiko.cbd.bank.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController extends BaseController{

    @Autowired
    public OrderController(OrderService orderService) {
        super(orderService);
    }

    @GetMapping
    @RequestMapping("/find")
    public Order findOrder(@RequestParam Long orderId, @RequestParam Long userId){
        return (Order) getService().find(orderId, userId);
    }

    @PostMapping
    @RequestMapping("/save")
    public Order saveOrder(@RequestBody Order payload){
        return (Order) getService().save(payload);
    }

}
