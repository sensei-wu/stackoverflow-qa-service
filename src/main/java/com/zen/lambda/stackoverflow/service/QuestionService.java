package com.zen.lambda.stackoverflow.service;

import com.zen.lambda.stackoverflow.domain.Question;

import java.util.List;

/**
 * Created by cheruveettilz on 18/03/17.
 */
public interface QuestionService {

    List<Question> getAllUnanswered();

    List<Question> getAllFeatured();
}
