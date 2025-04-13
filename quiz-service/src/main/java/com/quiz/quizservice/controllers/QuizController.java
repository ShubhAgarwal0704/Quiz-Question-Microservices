package com.quiz.quizservice.controllers;

import com.quiz.quizservice.entities.Quiz;
import com.quiz.quizservice.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/create")
    public ResponseEntity<Quiz> createQuiz(@RequestBody Quiz quiz) {
        return new ResponseEntity<>(quizService.add(quiz), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Quiz>> getAllQuiz() {
        return new ResponseEntity<>(quizService.get(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Quiz> getQuizById(@PathVariable Long id) {
        return new ResponseEntity<>(quizService.getById(id), HttpStatus.OK);
    }
}
