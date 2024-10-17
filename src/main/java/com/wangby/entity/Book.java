package com.wangby.entity;

import java.math.BigDecimal;

public class Book {
    private int id; // 改为int类型
    private String title;
    private String author;
    private String isbn;
    private BigDecimal price; // 使用BigDecimal来处理金钱相关的数值
    private Integer stock;
    private String description;
    private int categoryId; // 外键，关联书籍类别表，这里也假设为int类型

    // 构造方法
    public Book() {
        // 无参构造方法
    }


    // Getter 方法
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public String getDescription() {
        return description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    // Setter 方法
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    // toString 方法
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", description='" + description + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}