package com.zzl.laoban_back.service.impl;

import com.zzl.laoban_back.daoobject.Question;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionServiceImplTest {

    @Autowired
    private QuestionServiceImpl questionService;

    @Test
    public void findAll() {
        List<Question> questionList = questionService.findAll();
        Assert.assertNotEquals(0,questionList.size());
    }

    @Test
    public void save() {
        Question question = new Question();
        question.setQuestionTitle("我在测试新加一条问题");
        question.setQuestionContent("这是新加问题的内容");
        Question result = questionService.save(question);
        Assert.assertNotEquals(null,result);
    }
}