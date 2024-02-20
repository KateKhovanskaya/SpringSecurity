package com.example.SpringSecurity.controllers;

import com.example.SpringSecurity.services.AdminService;
import com.example.SpringSecurity.services.HomeService;
import com.example.SpringSecurity.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    /**
     * Сервис управления домашней страницей
     */
    private final HomeService homeService;
    /**
     * Сервис управления общедоступной страницей страницей
     */
    private final UserService userService;
    /**
     * Сервис управления приватной страницей
     */
    private final AdminService adminService;

    public HomeController(HomeService homeService, UserService userService, AdminService adminService) {
        this.homeService = homeService;
        this.userService = userService;
        this.adminService = adminService;
    }

    /**
     * Отображение домашней страницы
     * @param model модель для передачи информации в thymeleaf
     * @return страница index.html
     */
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("text", homeService.getText());
        return "index";
    }

    /**
     * отображение страницы /index
     * @return редирект на "/"
     */
    @GetMapping("/index")
    public String index() {
        return "redirect:/";
    }

    /**
     * Отображение публичной страницы
     * @param model модель для передачи информации в thymeleaf
     * @return страница public-data.html
     */
    @GetMapping("/public-data")
    public String publicPage(Model model){
        model.addAttribute("text", userService.getText());
        return "public-data";
    }

    /**
     * Отображение страницы для админой
     * @param model модель для передачи информации в thymeleaf
     * @return страница private-data.html
     */
    @GetMapping("/private-data")
    public String privatePage(Model model){
        model.addAttribute("text", adminService.getText());
        return "private-data";
    }
}
