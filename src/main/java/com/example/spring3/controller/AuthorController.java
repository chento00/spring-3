package com.example.spring3.controller;
import com.example.spring3.model.request.AuthorRequest;
import com.example.spring3.model.respone.ApiResponse;
import com.example.spring3.model.entity.Author;
import com.example.spring3.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;
@RestController
public class AuthorController {
    private final AuthorService authorService;
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public List<Author> getAllAuthor(){
        return  authorService.getAllAuthor();
    }
    @GetMapping("/authors/{id}")
    public ResponseEntity<?> getAuthorById(@PathVariable Integer id){
        Author author=authorService.getAuthorById(id);
        ApiResponse<Author> response=new ApiResponse<>(
                LocalDateTime.now(),
                HttpStatus.OK,
                "Success",
                author
        );
        return ResponseEntity.ok(response);
    }
    @PostMapping("/authors")
    public ResponseEntity<?> insertAuthor(@RequestBody Author author){
     return    ResponseEntity.ok(
             new ApiResponse<Author>(
                     LocalDateTime.now(),
                     HttpStatus.OK,
                     "Success",
                     authorService.insertAuthor(author)
             )
     );
    }
    @PutMapping("/author/{id}")
    public ResponseEntity<?> updateAuthor(@PathVariable Integer id,@RequestBody AuthorRequest author){
        authorService.updateAuthor(id,author);
        return ResponseEntity.ok(
                new ApiResponse<Author>(
                        LocalDateTime.now(),
                        HttpStatus.OK,
                        "Success",
                        null
                )
        );
    }
    @DeleteMapping("author/{id}")
    public ResponseEntity<?> deleteAuthor(@PathVariable Integer id){
        authorService.deleteAuthor(id);
        return ResponseEntity.ok(
                new ApiResponse<Author>(
                        LocalDateTime.now(),
                        HttpStatus.OK,
                        "Success",
                        null
                )
        );
    }
}
