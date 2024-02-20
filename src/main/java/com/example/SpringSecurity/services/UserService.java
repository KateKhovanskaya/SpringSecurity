package com.example.SpringSecurity.services;

import org.springframework.stereotype.Service;

@Service

public class UserService {
    /**
     * Получение текста для общедоступной страницы
     * @return текст для общедоступной страницы
     */
    public String getText() {
        return "Public Page";
    }
}
