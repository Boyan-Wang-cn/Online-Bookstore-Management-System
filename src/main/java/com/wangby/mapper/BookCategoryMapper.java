package com.wangby.mapper;

import com.wangby.entity.BookCategory;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookCategoryMapper {
    @Select("select * from t_book_categories")
    List<BookCategory> selectBookCategoty();

    // 根据ID查询书籍类别
    @Select("SELECT * FROM t_book_categories WHERE id = #{id}")
    List<BookCategory> selectBookCategoryById(@Param("id") int id);

    // 根据名称查询书籍类别
    @Select("SELECT * FROM t_book_categories WHERE name = #{name}")
    BookCategory selectBookCategoryByName(@Param("name") String name);

    // 插入书籍类别
    @Insert("INSERT INTO t_book_categories VALUES (null,#{name})")
    int insertBookCategory(BookCategory bookCategory);

    // 更新书籍类别
    @Update("UPDATE t_book_categories SET name = #{name} WHERE id = #{id}")
    int updateBookCategory(BookCategory bookCategory);

    // 删除书籍类别
    @Delete("DELETE FROM t_book_categories WHERE id = #{id}")
    int deleteBookCategoryById(@Param("id") int id);

}