package com.wangby.biz;

import com.wangby.entity.Order;
import com.wangby.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderBiz {
    @Autowired
    private OrderMapper mapper;

    // 查询所有订单
    public List<Order> getAllOrders() {
        return mapper.selectAllOrders();
    }

    // 插入订单
    public int createOrder(Order order) {
        // 注意：这里可能需要从Order对象中提取参数，或者确保Order对象可以直接用于插入
        return mapper.insertOrder(order); // 假设OrderMapper的insertOrder方法可以直接接受Order对象
    }

}
