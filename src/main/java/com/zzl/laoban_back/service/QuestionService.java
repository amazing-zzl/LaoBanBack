package com.zzl.laoban_back.service;

import com.zzl.laoban_back.daoobject.Question;

import java.util.List;

public interface QuestionService {

    /*查找所有问题*/
    List<Question> findAll();

    Question save(Question question);

}
