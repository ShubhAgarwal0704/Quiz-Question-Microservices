package com.question.questionservice.repositories;

import com.question.questionservice.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> getQuestionsByQuizId(Long quizId);
}
