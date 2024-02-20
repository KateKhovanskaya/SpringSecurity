package com.example.SpringSecurity.services;

import org.springframework.stereotype.Service;

@Service

public class HomeService {
    /**
     * Получение текста для домашней страницы
     * @return текст для домашней страницы
     */
    public String getText(){
        return "Home";
    }
}
