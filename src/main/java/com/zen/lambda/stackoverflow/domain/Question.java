package com.zen.lambda.stackoverflow.domain;

/**
 * Created by cheruveettilz on 17/03/17.
 */
public class Question {
    private long questionId;
    private Answer acceptedAnswer;
    private int answerCount;
    private Answer[] answers;
    private String body;
    private int bountyAmount;
    private boolean isAnswered;
    private ShallowUser owner;
    private String title;
    private int upVoteCount;
    private int downVoteCount;
    private String[] tags;
    private int viewCount;
}
