package com.zzl.laoban_back.controller;

import com.zzl.laoban_back.VO.ResultVO;
import com.zzl.laoban_back.daoobject.Answer;
import com.zzl.laoban_back.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 回答页
 */
@RestController
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    /**
     * http://47.98.50.35:8080/laoban_back/answer/index?QuestionId=3
     * @param questionId
     * @return
     */
    @GetMapping("/index")
    public ResultVO answer(@RequestParam("QuestionId") Integer questionId){
        //1.根据questionId查询数据
        List<Answer> answerList = answerService.findByQuestionId(questionId);
        //2.组装数据
        ResultVO<List<Answer>> resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setMsg("获取回答成功");
        resultVO.setData(answerList);
        //3.返回数据
        return resultVO;
    }


    /**
     * http://47.98.50.35:8080/laoban_back/answer/save?query=&questionId=3&answerContent=zheshiceshi
     * @param questionId
     * @param answerContent
     * @return
     */
    @GetMapping("/save")
    public ResultVO saveAnswer(@RequestParam("questionId") Integer questionId,
                               @RequestParam("answerContent") String answerContent){
        //1.获取answer参数
        //2.存储answer
        Answer answer = new Answer();
        answer.setQuestionId(questionId);
        answer.setAnswerContent(answerContent);
        Answer result = answerService.save(answer);
        //3.返回
        ResultVO<Answer> answerResultVO = new ResultVO<>();
        answerResultVO.setCode(200);
        answerResultVO.setMsg("存储回答成功");
        answerResultVO.setData(result);
        return answerResultVO;
    }

}
