package com.kuebiko.cbd.bank.controller;

import com.kuebiko.cbd.bank.model.Order;
import com.kuebiko.cbd.bank.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public Order findOrder(@RequestParam Long orderId){
        return (Order) getService().find(orderId);
    }

    @PostMapping
    @RequestMapping("/save")
    public ResponseEntity<Order> saveOrder(@RequestBody Order payload){
        Order order = new Order();
        try{
            order =  (Order) getService().save(payload);
        }catch(Exception e){
            order.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(order);
        }
        return ResponseEntity.ok(order);
    }

}
