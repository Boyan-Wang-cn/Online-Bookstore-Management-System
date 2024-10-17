package com.wangby.entity;



public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private Role role; // 使用枚举类型来管理用户角色
    private String registered;

    // 构造方法
    public User() {
        // 无参构造方法，用于框架实例化对象
    }


    // Getter 和 Setter 方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    // toString 方法
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", registered=" + registered +
                '}';
    }

    // 用户角色枚举类
    public enum Role {
        User,Admin
    }
}