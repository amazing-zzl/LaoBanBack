package com.zzl.laoban_back.service;

import com.zzl.laoban_back.daoobject.Answer;

import java.util.List;

public interface AnswerService {

    List<Answer> findAll();

    Answer save(Answer answer);

    List<Answer> findByQuestionId(Integer id);


}
