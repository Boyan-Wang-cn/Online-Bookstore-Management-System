package com.wangby.biz;

import com.wangby.entity.Book;
import com.wangby.mapper.BookMapper;
import com.wangby.util.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookBiz {
    @Autowired
    private BookMapper mapper;

    // 获取所有书籍列表
    public List<Book> getBookList() {
        return mapper.selectBooks();
    }

    // 根据ID查询书籍
    public Book getBookById(int id) {
        return mapper.selectBookById(id);
    }

    // 根据author查询书籍
    public List<Book> getBookByAuthor(String author) {
        return mapper.selectBookByAuthor(author);
    }

    // 插入书籍
    public boolean addBook(Book book) {
        System.out.println(book);
        return  mapper.insertBook(book)>0;
    }

    // 更新书籍
    public boolean updateBook(Book book) {
        List<Book> bookList=mapper.selectBooks();
        for(int i=0;i<bookList.size();i++){
            if(book.getIsbn().equals(bookList.get(i).getIsbn())){
                throw new MyException("Isbn已存在");
            }
        }
        return mapper.updateBook(book) > 0;
    }

    // 删除书籍
    public boolean deleteBookById(int id) {
        return mapper.deleteBookById(id) > 0;
    }

    public void setMapper(BookMapper mapper) {
        this.mapper = mapper;
    }
}
