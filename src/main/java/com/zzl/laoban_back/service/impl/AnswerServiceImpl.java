package com.zzl.laoban_back.service.impl;

import com.zzl.laoban_back.daoobject.Answer;
import com.zzl.laoban_back.repository.AnswerRepository;
import com.zzl.laoban_back.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    private final AnswerRepository repository;

    @Autowired
    public AnswerServiceImpl(AnswerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Answer> findAll() {
        return repository.findAll();
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public Answer save(Answer answer) {
        return repository.save(answer);
    }

    @Override
    public List<Answer> findByQuestionId(Integer id) {
        return repository.findByQuestionId(id);
    }
}
