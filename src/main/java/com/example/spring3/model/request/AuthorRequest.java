package com.example.spring3.model.request;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AuthorRequest {
    private String name;
    private String gender;
}
