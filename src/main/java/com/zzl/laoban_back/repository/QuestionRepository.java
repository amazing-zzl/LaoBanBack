package com.zzl.laoban_back.repository;

import com.zzl.laoban_back.daoobject.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
}
