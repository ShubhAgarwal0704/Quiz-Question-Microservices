package com.question.questionservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question-check")
public class HealthCheckController {

    @GetMapping("/")
    public String healthCheck() {
        return "OK";
    }
}

