package com.wangby.controller;


import com.wangby.biz.OrderBiz;
import com.wangby.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/orders") // 假设所有订单相关的请求都以/orders为前缀
public class OrderController {

    @Autowired
    private OrderBiz orderBiz;


    // 查询所有订单
    @RequestMapping("/list")
    public Map getAllOrders() {
        List<Order> orders = orderBiz.getAllOrders();
        Map response = new HashMap<>();
        response.put("orders", orders);
        response.put("isOk", true);
        response.put("msg", "所有订单查询成功");
        return response;
    }


    // 插入订单
    @RequestMapping("/add")
    public Map createOrder( Order order) {
        System.out.println(order);
        int result = orderBiz.createOrder(order);
        Map response = new HashMap<>();
        if (result > 0) {
            response.put("isOk", true);
            response.put("msg", "订单创建成功");
        } else {
            response.put("isOk", false);
            response.put("msg", "订单创建失败");
        }
        return response;
    }
}