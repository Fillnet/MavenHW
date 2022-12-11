package com.example.mavenhw.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String run() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String info() {
        return "1.Теникайтис Филипп Викторович<br>" +
                "2. Книга рецептов<br>" +
                "3. 11.12.2022<br>" +
                "4. Проект по созданию книги рецептов, будет реализован с помощью Maven на языке Java";
    }

}
