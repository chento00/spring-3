package com.example.spring3.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class book_details {
    private Integer id;
    private Integer book_id;
    private Integer category_id;
}
