package com.zen.lambda.stackoverflow.controller;

import com.zen.lambda.stackoverflow.domain.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by cheruveettilz on 18/03/17.
 */
@RestController
public class QuestionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuestionController.class);

    private final RestTemplate restTemplate;

    public QuestionController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
        this.restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());

    }

    @RequestMapping("questions")
    public List<Question> getAllUnanswered() {
        String result = restTemplate.getForObject("https://api.stackexchange.com/2.2/questions?order=desc&sort=activity&site=stackoverflow", String.class);
        LOGGER.info(result);
        return null;
    }

    public List<Question> getAllFeatured() {
        return null;
    }
}
