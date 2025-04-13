package com.quiz.quizservice.services;

import com.quiz.quizservice.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {

    @GetMapping("/question/quiz/{quizId}")
    public ResponseEntity<List<Question>> getQuestionsByQuizId(@PathVariable Long quizId);
}
