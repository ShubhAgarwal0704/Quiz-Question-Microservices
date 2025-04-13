package com.quiz.quizservice.repositories;

import com.quiz.quizservice.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
