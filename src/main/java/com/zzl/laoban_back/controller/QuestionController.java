package com.zzl.laoban_back.controller;

import com.zzl.laoban_back.VO.ResultVO;
import com.zzl.laoban_back.daoobject.Question;
import com.zzl.laoban_back.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
  问题页
 */

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/index")
    public ResultVO question(){

        //1. 获取数据
        Sort sort = new Sort(Sort.Direction.DESC, "questionId");
        List<Question> questionList = questionService.findAll();
        //2. 组装数据
        ResultVO<List<Question>> resultVO =new ResultVO<>();
        resultVO.setCode(200);
        resultVO.setMsg("获取问题成功");
        resultVO.setData(questionList);
        //3.返回获取的数据
        return resultVO;
    }


    /**
     * http://localhost:8080/laoban_back/question/save?query=&questionTitle=Title&questionContent=emmmmmmm
     * @param questionTitle
     * @param questionContent
     * @return
     */
    @GetMapping("/save")
    public ResultVO saveQuestion(@RequestParam("questionTitle") String questionTitle,
                               @RequestParam("questionContent") String questionContent){
        //1.获取question参数
        //2.存储question
        Question question = new Question();
        question.setQuestionTitle(questionTitle);
        question.setQuestionContent(questionContent);
        Question result = questionService.save(question);
        //3.返回
        ResultVO<Question> resultVO = new ResultVO<>();
        resultVO.setCode(200);
        resultVO.setMsg("存储问题成功");
        resultVO.setData(result);
        return resultVO;
    }
}
