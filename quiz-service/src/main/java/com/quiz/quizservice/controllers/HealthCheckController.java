package com.quiz.quizservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz-check")
public class HealthCheckController {

    @GetMapping("/")
    public String healthCheck() {
        return "OK";
    }
}
