package com.zzl.laoban_back.repository;

import com.zzl.laoban_back.daoobject.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer,Integer> {
    List<Answer> findByQuestionId(Integer id);

}
