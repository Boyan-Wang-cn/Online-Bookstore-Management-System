package com.wangby.controller;

import com.wangby.biz.BookBiz;
import com.wangby.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookBiz bookBiz; // 注入BookBiz服务

    // 获取所有书籍列表
    @RequestMapping("/list")
    public Map<String, Object> getAllBooks() {
        List<Book> books = bookBiz.getBookList();
        Map response = new HashMap<>();
        response.put("isOk", true);
        response.put("books", books);
        response.put("msg", "查询成功");
        return response;
    }

    // 根据ID查询书籍
    @RequestMapping("/idsearch")
    public Map idsearch(int id) {
        Book book = bookBiz.getBookById(id);
        Map response = new HashMap<>();
        if (book != null) {
            response.put("isOk", true);
            response.put("book", book);
            response.put("msg", "查询成功");
        } else {
            response.put("isOk", false);
            response.put("msg", "书籍未找到");
        }
        return response;
    }

    // 根据ISBN查询书籍（假设有对应的接口）
    @RequestMapping("/authorsearch")
    public Map authornsearch(String author) {
        List<Book> book = bookBiz.getBookByAuthor(author);
        Map response = new HashMap<>();
        if (book != null) {
            response.put("isOk", true);
            response.put("book", book);
            response.put("msg", "查询成功");
        } else {
            response.put("isOk", false);
            response.put("msg", "书籍未找到");
        }
        return response;
    }

    // 插入书籍
    @RequestMapping("/add")
    public Map  addBook(Book book) {
        System.out.println(book);
        boolean isOk = bookBiz.addBook(book);
        Map response = new HashMap<>();
        if (isOk) {
            response.put("isOk", true);
            response.put("msg", "书籍添加成功");
        } else {
            response.put("isOk", false);
            response.put("msg", "书籍添加失败");
        }
        return response;
    }

    // 更新书籍
    @PostMapping("/update")
    public Map updateBook(@RequestBody Book bookDetails) {
        boolean isOk = bookBiz.updateBook(bookDetails);
        Map response = new HashMap<>();
        if (isOk) {
            response.put("isOk", true);
            response.put("msg", "书籍更新成功");
        } else {
            response.put("isOk", false);
            response.put("msg", "书籍更新失败");
        }
        return response;
    }

    // 删除书籍
    @RequestMapping ("/del")
    public Map deleteBook(int id) {
     boolean isOk = bookBiz.deleteBookById(id);
        Map response = new HashMap<>();
        if (isOk) {
            response.put("isOk", true);
            response.put("msg", "书籍删除成功");
        } else {
            response.put("isOk", false);
            response.put("msg", "书籍删除失败");
        }
        return response;
    }
}
