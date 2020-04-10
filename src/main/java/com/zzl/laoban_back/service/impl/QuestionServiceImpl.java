package com.zzl.laoban_back.service.impl;

import com.zzl.laoban_back.daoobject.Question;
import com.zzl.laoban_back.repository.QuestionRepository;
import com.zzl.laoban_back.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository repository;

    @Autowired
    public QuestionServiceImpl(QuestionRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Question> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Question save(Question question) {
        return repository.save(question);
    }
}
