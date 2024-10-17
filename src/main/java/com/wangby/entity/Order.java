package com.wangby.entity;

import java.math.BigDecimal;

public class Order {
    private int id; // 改为int类型
    private int count;
    private String name;

    private String orderDate;
    private BigDecimal totalPrice; // 使用BigDecimal来处理总价


    // 构造方法
    public Order() {
        // 无参构造方法
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", count=" + count +
                ", name='" + name + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

