package com.example.spring3.service;
import com.example.spring3.model.entity.Author;
import com.example.spring3.model.request.AuthorRequest;
import com.example.spring3.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class AuthorServiceImp implements AuthorService {

    private  AuthorRepository authorRepository;

    public AuthorRepository getAuthorRepository() {
        return authorRepository;
    }
    @Autowired
    public void setAuthorRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getAllAuthor() {
        return authorRepository.getAllAuthor();
    }

    @Override
    public Author getAuthorById(Integer id) {
        return authorRepository.getAuthorByID(id);
    }

    @Override
    public Author insertAuthor(Author author) {
        return authorRepository.insertAuthor(author);
    }

    @Override
    public void updateAuthor(Integer id, AuthorRequest author) {
         authorRepository.updateAuthor(id,author);
    }

    @Override
    public void deleteAuthor(Integer id) {
        authorRepository.deleteAuthor(id);
    }


}
