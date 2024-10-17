package com.wangby.biz;

import com.wangby.entity.User;
import com.wangby.mapper.UserMapper;
import com.wangby.util.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserBiz {
    @Autowired//由Spring创建对象并通过setter方法注入
    private UserMapper mapper;

    // 获取所有用户列表
    public List<User> getUserList() {
        return mapper.selectUsers();
    }

    // 根据ID查询用户
    public List<User> getUserById(int id) {

        return mapper.selectUserById(id);
    }

    // 根据用户名查询用户
    public List<User> getUserByUsername(String username) {
        System.out.println(mapper.selectUserByUsername(username));
        return mapper.selectUserByUsername(username);
    }

    // 插入用户
    public boolean addUser(User user) {
        return mapper.insertUser(user) > 0;
    }

    // 更新用户
    public boolean updateUser(User user) {
        List<User> userList=mapper.selectUsers();
        for(int i=0;i<userList.size();i++){
            if(user.getUsername().equals(userList.get(i).getUsername())){
                throw new MyException("用户名已存在");
            }
        }
        return mapper.updateUser(user) > 0;
    }

    // 删除用户
    public boolean removeUser(int id) {
        return mapper.deleteUserById(id) > 0;
    }

    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    public User checkLogin(User user){
        User dbUser=mapper.selectUserByUsername(user.getUsername()).get(0);
        if((dbUser!=null&&dbUser.getPassword().equals(user.getPassword()))&&dbUser.getRole().equals(user.getRole())) {
            dbUser.setPassword(null);
            return dbUser;
        }else if(dbUser==null){
            throw new MyException("登陆失败，用户不存在");
        }else if(!dbUser.getPassword().equals(user.getPassword())){
            throw new MyException("登陆失败，密码错误");
        }else {
            throw new MyException("登陆失败，用户无权限登录（角色不匹配）");
        }

    }
}

