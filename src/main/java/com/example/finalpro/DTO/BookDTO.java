package com.example.finalpro.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class BookDTO {

    private Long Id;
    @NotEmpty(message = "Название книги не может быть пустым")
    @Column(name = "name")
    private String name;

    @Column(name = "yearOfProduction")
    private Integer yearOfProduction;

    @NotEmpty(message = "Имя автора не может быть пустым")
    @Column(name = "author")
    private String author;

    @NotEmpty(message = "Поле описание не может быть пустым")
    @Column(name = "annotation")
    private String annotation;

}
