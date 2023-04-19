package com.example.finalpro.models;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SearchBook {
    @NotEmpty(message = "Название книги не может быть пустым")
    private String name;
    private Integer yearOfProduction;
    private String author;


}
