package com.wangby.controller;

import com.wangby.biz.BookCategoryBiz;
import com.wangby.entity.BookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/categories")
public class BookCategoryController {

    @Autowired
    private BookCategoryBiz bookCategoryBiz;

    // 获取所有书籍类别列表
    @GetMapping("/list")
    public Map getAllBookCategories() {
        List<BookCategory> bookCategories = bookCategoryBiz.selectBookCategories();
        Map response = new HashMap<>();
        response.put("isOk", true);
        response.put("bookCategories", bookCategories);
        response.put("msg", "查询成功");
        return response;
    }

    // 根据ID查询书籍类别
    @RequestMapping("/idsearch")
    public Map getBookCategoryById( int id) {
        List<BookCategory> bookCategory = bookCategoryBiz.selectBookCategoryById(id);
        Map response = new HashMap<>();
        if (bookCategory != null) {
            response.put("isOk", true);
            response.put("bookCategory", bookCategory);
            response.put("msg", "查询成功");
        } else {
            response.put("isOk", false);
            response.put("msg", "书籍类别未找到");
        }
        return response;
    }

    // 根据名称查询书籍类别（假设存在该方法）
    @RequestMapping("/namesearch")
    public Map getBookCategoryByName(String name) {
        BookCategory bookCategory = bookCategoryBiz.selectBookCategoryByName(name);
        Map response = new HashMap<>();
        if (bookCategory != null) {
            response.put("isOk", true);
            response.put("bookCategory", bookCategory);
            response.put("msg", "查询成功");
        } else {
            response.put("isOk", false);
            response.put("msg", "书籍类别未找到");
        }
        return response;
    }

    // 插入书籍类别
    @RequestMapping("/add")
    public Map addBookCategory(BookCategory bookCategory) {
        boolean isOk = bookCategoryBiz.addBookCategory(bookCategory);
        Map response = new HashMap<>();
        if (isOk) {
            response.put("isOk", true);
            response.put("msg", "书籍类别添加成功");
        } else {
            response.put("isOk", false);
            response.put("msg", "书籍类别添加失败");
        }
        return response;
    }

    // 更新书籍类别
    @PostMapping("/update")
    public Map updateBookCategory(@RequestBody BookCategory bookCategory) {
        boolean isOk = bookCategoryBiz.updateBookCategory(bookCategory);
        Map response = new HashMap<>();
        if (isOk) {
            response.put("isOk", true);
            response.put("msg", "书籍类别更新成功");
        } else {
            response.put("isOk", false);
            response.put("msg", "书籍类别更新失败");
        }
        return response;
    }

    // 删除书籍类别
    @RequestMapping("/del")
    public Map deleteBookCategory(int id) {
        boolean isOk = bookCategoryBiz.deleteBookCategoryById(id);
        Map response = new HashMap<>();
        if (isOk) {
            response.put("isOk", true);
            response.put("msg", "书籍类别删除成功");
        } else {
            response.put("isOk", false);
            response.put("msg", "书籍类别删除失败");
        }
        return response;
    }
}
