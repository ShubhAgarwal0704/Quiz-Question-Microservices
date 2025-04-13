package com.question.questionservice.services.Impl;

import com.question.questionservice.entities.Question;
import com.question.questionservice.exceptions.QuestionNotFoundException;
import com.question.questionservice.repositories.QuestionRepository;
import com.question.questionservice.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestionById(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new QuestionNotFoundException("Question not found for id: " + id));
    }

    @Override
    public List<Question> getQuestionsByQuizId(Long quizId) {
        return questionRepository.getQuestionsByQuizId(quizId);
    }
}
