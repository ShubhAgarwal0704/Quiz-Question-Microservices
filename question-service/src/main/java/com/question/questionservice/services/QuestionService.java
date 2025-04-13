package com.question.questionservice.services;

import com.question.questionservice.entities.Question;

import java.util.List;

public interface QuestionService {

    Question createQuestion(Question question);

    List<Question> getQuestions();

    Question getQuestionById(Long id);

    List<Question> getQuestionsByQuizId(Long quizId);
}
