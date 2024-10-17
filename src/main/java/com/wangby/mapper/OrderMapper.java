package com.wangby.mapper;

import com.wangby.entity.Order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface OrderMapper {


    // 根据ID查询订单
    @Select("SELECT * FROM t_order WHERE id = #{id}")
    Order selectOrderById(int id);

    // 查询所有订单
    @Select("SELECT * FROM t_order")
    List<Order> selectAllOrders();


    // 插入订单
    @Insert("INSERT INTO t_order(count,totalPrice,name)  VALUES (#{count}, #{totalPrice}, #{name})")
    int insertOrder(Order order);

}