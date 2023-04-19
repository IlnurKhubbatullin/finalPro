package com.example.finalpro.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import java.time.LocalDateTime;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="person_id")
    private Person person;

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
