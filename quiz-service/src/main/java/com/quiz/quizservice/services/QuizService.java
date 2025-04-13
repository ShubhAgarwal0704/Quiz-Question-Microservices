package com.quiz.quizservice.services;


import com.quiz.quizservice.entities.Quiz;

import java.util.List;
import java.util.UUID;

public interface QuizService {

    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz getById(Long id);
}
