package com.example.spring3.model.entity;
import lombok.*;

import java.util.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    private Integer bookId;
    private String title;
    private Author author;
    private List<Category> categories;

}
