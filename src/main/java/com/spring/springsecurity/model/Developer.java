package com.spring.springsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // все геттеры и сеттеры
@AllArgsConstructor // конструктор из всех аргументов
public class Developer {
    private Long id;
    private String firstName;
    private String lastName;
}
