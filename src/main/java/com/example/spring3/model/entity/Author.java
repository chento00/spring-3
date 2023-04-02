package com.example.spring3.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Author {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer authorId;
    private String name;
    private String gender;
}
