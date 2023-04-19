package com.example.finalpro.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Book> personBooks;

    @NotEmpty(message = "Имя не может быть пустым")
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "email")
    private String email;

    @NotEmpty(message = "Поле номера телефона не может быть пустым")
    @Column(name = "phoneNumber")
    private String phoneNumber;

    @NotEmpty(message = "Поле пароля не может быть пустым")
    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    @Column(name = "removed")
    private boolean removed;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    @Column(name = "removedAt")
    private LocalDateTime removedAt;

    @Column(name = "createdPerson")
    private String createdPerson;

    @Column(name = "updatedPerson")
    private String updatedPerson;

    @Column(name = "removedPerson")
    private String removedPerson;
}
