package com.zzl.laoban_back.service.impl;

import com.zzl.laoban_back.daoobject.Answer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AnswerServiceImplTest {

    @Autowired
    private AnswerServiceImpl answerService;

    @Test
    public void findAll() {
        List<Answer> answers = answerService.findAll();
        Assert.assertNotEquals(0, answers.size());
    }

    @Test
    public void save() {
        Answer answer = new Answer();
        answer.setQuestionId(1);
        answer.setAnswerContent("这是问题id为1的回答");
        Answer result = answerService.save(answer);
        Assert.assertNotEquals(null,result);
    }

    @Test
    public void findByQuestionId(){
       List<Answer> answerList = answerService.findByQuestionId(1);
       Assert.assertNotEquals(0,answerList.size());
    }
}