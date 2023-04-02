package com.example.spring3.service;
import com.example.spring3.model.entity.Author;
import com.example.spring3.model.request.AuthorRequest;
import java.util.*;
public interface AuthorService {

    List<Author> getAllAuthor();

    Author getAuthorById(Integer id);

    Author insertAuthor(Author author);

    void updateAuthor(Integer id,AuthorRequest author);

    void deleteAuthor(Integer id);
}
