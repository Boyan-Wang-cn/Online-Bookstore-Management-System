package com.wangby.biz;

import com.wangby.entity.BookCategory;
import com.wangby.mapper.BookCategoryMapper;
import com.wangby.util.MyException;
import com.wangby.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCategoryBiz {
    @Autowired
    private  BookCategoryMapper mapper;


    // 获取所有书籍类别列表
    public List<BookCategory> selectBookCategories() {
        return mapper.selectBookCategoty();
    }

    // 根据ID查询书籍类别
    public List<BookCategory> selectBookCategoryById(int id) {
        return mapper.selectBookCategoryById(id);
    }

    // 根据名称查询书籍类别
    public BookCategory selectBookCategoryByName(String name) {
        return mapper.selectBookCategoryByName(name);
    }

    // 插入书籍类别
    public boolean addBookCategory(BookCategory bookCategory) {
        List<BookCategory> bookCategoryList=mapper.selectBookCategoty();
        for(int i=0;i<bookCategoryList.size();i++){
            if(bookCategoryList.get(i).getName().equals(bookCategory.getName())){
                throw new MyException("已经存在该类别图书");
            }
        }
        return mapper.insertBookCategory(bookCategory) > 0;
    }

    // 更新书籍类别
    public boolean updateBookCategory(BookCategory bookCategory) {
        return mapper.updateBookCategory(bookCategory) > 0;
    }

    // 删除书籍类别
    public boolean deleteBookCategoryById(int id) {
        return mapper.deleteBookCategoryById(id) > 0;
    }

}