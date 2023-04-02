package com.example.spring3.service;

import com.example.spring3.model.entity.Book;
import com.example.spring3.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImp implements BookService {

    private  final BookRepository bookRepository;

    public BookServiceImp(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookRepository getBookRepository(){
        return bookRepository;
    }
    @Override
    public List<Book> getAllBook() {
        return bookRepository.getAllBook();
    }
}
