package com.wangby.controller;

import com.wangby.biz.UserBiz;
import com.wangby.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserBiz biz;

    public void setBiz(UserBiz biz) {
        this.biz = biz;
    }

    // 获取所有用户列表
    @RequestMapping ("/list")
    public Map findAll() {
        List<User> userList = biz.getUserList();
        Map map = new HashMap<>();
        map.put("isOk", true);
        map.put("users", userList);
        map.put("msg", "查询成功");
        return map;
    }

    // 根据ID查询用户
    @RequestMapping("/idsearch")
    public Map idsearch(int id) {
        List<User> userlist = (List<User>) biz.getUserById(id);
        Map responseMap = new HashMap<>();
        if (userlist != null) {
            responseMap.put("isOk", true);
            responseMap.put("user", userlist);
            responseMap.put("msg", "查询成功");

        } else {
            responseMap.put("isOk", false);
            responseMap.put("msg", "用户不存在");

        }
        return responseMap;
    }

    // 根据用户名查询用户
    @RequestMapping("/namesearch")
    public Map namesearch(String username) {

        List<User> users =(List<User>) biz.getUserByUsername(username);
        Map responseMap = new HashMap<>();
        if (users != null) {
            responseMap.put("isOk", true);
            responseMap.put("users", users);
            responseMap.put("msg", "查询成功");
        } else {
            responseMap.put("isOk", false);
            responseMap.put("msg", "用户不存在");

        }
        return responseMap;
    }

    // 插入用户
    @RequestMapping("/add")
    public Map add(User user) {
        boolean isOk = biz.addUser(user);
        Map responseMap = new HashMap<>();
        if (isOk) {
            responseMap.put("isOk", true);
            responseMap.put("msg", "用户添加成功");
        } else {
            responseMap.put("isOk", false);
            responseMap.put("msg", "添加用户失败");

        }
        return responseMap;
    }
    // 更新用户
    @PostMapping("/update")
    public Map updateUser(@RequestBody User userDetails) {
        System.out.println(userDetails);
        System.out.println(userDetails);
        boolean isOk = biz.updateUser(userDetails);
        Map response = new HashMap<>();
        if (isOk) {
            response.put("isOk", true);
            response.put("msg", "用户更新成功");

        } else {
            response.put("isOk", false);
            response.put("msg", "用户更新失败");

        }
        return response;

    }

    // 删除用户
    @RequestMapping("/del")
    public Map deleteUser(int id) {
        System.out.println(id);
       boolean isOk = biz.removeUser(id);
        Map response = new HashMap<>();
        if (isOk) {
            response.put("isOk", true);
            response.put("message", "删除成功");
        } else {
            response.put("isOk", false);
            response.put("message", "删除失败");

        }
        return response;
    }

    @RequestMapping("/login")
    public Map login(User user, HttpSession session){
        user=biz.checkLogin(user);
        session.setAttribute("login_user",user);
        Map map=new HashMap();
        map.put("isOk",true);
        map.put("user",user);
        map.put("msg","登陆成功");
        return map;
    }
    @RequestMapping("/logout")
    public Map logout(HttpSession session){
        Map map=new HashMap();
        try {
            session.invalidate();
            map.put("isOk", true);
            map.put("msg", "退出成功");
        }catch (Exception e){
            map.put("isOk", false);
            map.put("msg", "退出失败："+e.getMessage());
        }
        return map;
    }




}