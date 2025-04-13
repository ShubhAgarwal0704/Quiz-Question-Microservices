package com.quiz.quizservice.services.Impl;

import com.quiz.quizservice.entities.Quiz;
import com.quiz.quizservice.exceptions.QuizNotFoundException;
import com.quiz.quizservice.repositories.QuizRepository;
import com.quiz.quizservice.services.QuestionClient;
import com.quiz.quizservice.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionClient questionClient;

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        List<Quiz> quizList = quizRepository.findAll();
        return quizList
                .stream()
                .peek(quiz -> quiz
                        .setQuestions(questionClient
                                .getQuestionsByQuizId(quiz.getId())
                                .getBody()))
                .toList();
    }

    @Override
    public Quiz getById(Long id) {
        return quizRepository.findById(id).orElseThrow(() -> new QuizNotFoundException("Quiz not found for id: " + id));
    }
}
