package com.example.spring3.repository;
import com.example.spring3.model.entity.Author;
import com.example.spring3.model.request.AuthorRequest;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.*;
@Mapper
@Repository
public interface AuthorRepository {

    @Result(property = "authorId",column = "author_id")
    @Select("""
           SELECT *FROM authors
            """)
    @Results(id = "authorMap",value = {
            @Result(property = "authorId",column = "author_id")
    })
    @ResultMap("authorMap")
    List<Author> getAllAuthor();


    @Select("""
            SELECT *FROM authors
            WHERE author_id=#{id}
            """)
    @ResultMap("authorMap")
    Author getAuthorByID(Integer id);

    @Select(
            """
            INSERT INTO authors
                (author_name,gender)
                VALUES (#{author.name},#{author.male}) 
                 RETURNING * 
                    """
    )
    @ResultMap("authorMap")
    Author insertAuthor(@Param("author") Author author);

    @Update("""
            UPDATE author SET
            author_name=#{author.name}
            gender=#{author.gender}
            WHERE author_id=#{id}
            RETURNING *
            """)
    @ResultMap("authorMap")
    void updateAuthor(Integer id,@Param("author") AuthorRequest author);

    @Delete(
            """
            DELETE FROM author WHERE author_id=  #{id}      
            """
    )
    void deleteAuthor(Integer id);
}
