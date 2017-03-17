package com.zen.lambda.stackoverflow.domain;

import java.util.Date;

/**
 * Created by cheruveettilz on 17/03/17.
 */
public class Answer {
    private long answerId;
    private String body;
    private Date creationDate;
    private int downVoteCount;
    private boolean isAccepted;
    private ShallowUser owner;
    private Question question;
    private int score;
    private String[] tags;
    private String title;
    private int upVoteCount;


}
