package com.wangby.mapper;

import com.wangby.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from t_user")
    List<User> selectUsers();

    // 根据ID查询用户
    @Select("SELECT * FROM t_user WHERE id = #{id}")
    List<User> selectUserById(@Param("id") int id);

    // 根据用户名查询用户
    @Select("SELECT * FROM t_user WHERE username = #{username}")
    List<User> selectUserByUsername(@Param("username") String username);

    // 插入用户
    @Insert("INSERT INTO t_user (username,password,email,role) VALUES (#{username}, #{password}, #{email}, #{role})")
    int insertUser(User user);

    // 更新用户
    @Update("UPDATE t_user SET username = #{username}, password = #{password}, email = #{email} WHERE id = #{id}")
    int updateUser(User user);

    // 删除用户
    @Delete("DELETE FROM t_user WHERE id = #{id}")
    int deleteUserById(int id);

}
