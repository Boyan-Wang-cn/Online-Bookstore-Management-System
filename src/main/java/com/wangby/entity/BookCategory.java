package com.wangby.entity;

public class BookCategory {
    private int id; // 改为int类型
    private String name;

    // 构造方法
    public BookCategory() {
        // 无参构造方法
    }


    // Getter 方法
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setter 方法
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString 方法
    @Override
    public String toString() {
        return "BookCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}