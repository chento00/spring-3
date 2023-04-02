package com.example.spring3.service;

import com.example.spring3.model.entity.Book;
import org.springframework.stereotype.Service;
import java.util.List;

public interface BookService {

    List<Book> getAllBook();
}
