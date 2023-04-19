package com.example.finalpro.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
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
public class PersonDTO {

    private Long id;
    @NotEmpty(message = "Имя не может быть пустым")
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @NotEmpty(message = "Поле электронной почты не может быть пустым")
    @Column(name = "email")
    private String email;

    @NotEmpty(message = "Поле номера телефона не может быть пустым")
    @Column(name = "phoneNumber")
    private String phoneNumber;

}
