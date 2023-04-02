package com.example.spring3.controller;

import com.example.spring3.model.entity.Book;
import com.example.spring3.model.respone.ApiResponse;
import com.example.spring3.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.*;
@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/books")
    public ResponseEntity<?> getAllBook(){
        return ResponseEntity.ok(
            new ApiResponse<List<Book>>(
                    LocalDateTime.now(),
                    HttpStatus.OK,
                    "Success",
                    bookService.getAllBook()
            )
        );

    }
}
