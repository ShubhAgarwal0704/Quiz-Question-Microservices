package com.quiz.quizservice.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Question {
    private Long id;
    private String question;
    private Long quizId;
}
