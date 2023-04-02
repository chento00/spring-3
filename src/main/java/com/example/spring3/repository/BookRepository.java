package com.example.spring3.repository;

import com.example.spring3.model.entity.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookRepository {
    @Select("""
            SELECT FROM *books
            """)
    @Result(property = "author",column = "author_id",
    one =@One(select = "com/example/spring3/repository/AuthorRepository.getAuthorByID"))
    List<Book> getAllBook();
}
