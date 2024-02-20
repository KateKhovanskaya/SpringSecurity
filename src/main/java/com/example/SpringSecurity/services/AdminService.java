package com.example.SpringSecurity.services;

import org.springframework.stereotype.Service;

@Service

public class AdminService {
    /**
     * Получение текста для страницы админой
     * @return текст для страницы админой
     */
    public String getText() {
        return "Admin Page";
    }

}
