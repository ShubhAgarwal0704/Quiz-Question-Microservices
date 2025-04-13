package com.question.questionservice.controllers;

import com.question.questionservice.entities.Question;
import com.question.questionservice.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/create")
    public ResponseEntity<Question> create(@RequestBody Question question) {
        return new ResponseEntity<>(questionService.createQuestion(question), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return new ResponseEntity<>(questionService.getQuestions(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> getQuestionById(@PathVariable Long id) {
        return new ResponseEntity<>(questionService.getQuestionById(id), HttpStatus.OK);
    }

    @GetMapping("/quiz/{quizId}")
    public ResponseEntity<List<Question>> getQuestionsByQuizId(@PathVariable Long quizId) {
        return new ResponseEntity<>(questionService.getQuestionsByQuizId(quizId), HttpStatus.OK);
    }
}
