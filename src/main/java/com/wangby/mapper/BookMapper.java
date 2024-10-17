package com.wangby.mapper;

import com.wangby.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("select * from t_books")
    List<Book> selectBooks();

    // 根据ID查询书籍
    @Select("SELECT * FROM t_books WHERE id = #{id}")
    Book selectBookById(@Param("id") int id);

    // 根据作者查询书籍
    @Select("SELECT * FROM t_books WHERE author = #{author}")
    List<Book> selectBookByAuthor(@Param("author") String author);

    // 插入书籍
    @Insert("INSERT INTO t_books VALUES (null,#{title}, #{author}, #{isbn}, #{price}, #{stock}, #{description}, #{categoryId})")
    int insertBook(Book book);

    // 更新书籍
    @Update("UPDATE t_books SET title = #{title}, author = #{author}, isbn=#{isbn}, price = #{price}, stock = #{stock}, description = #{description}, categoryId=#{categoryId} WHERE id = #{id}")
    int updateBook(Book book);

    // 删除书籍
    @Delete("DELETE FROM t_books WHERE id = #{id}")
    int deleteBookById(@Param("id") int id);

}
