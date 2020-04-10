package com.zzl.laoban_back.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

@Data
@DynamicUpdate
public class AnswerVO {
    @JsonProperty("id")
    private Integer answerId;

    /*问题id*/
    @JsonProperty("questionId")
    private Integer questionId;

    /*内容*/
    @JsonProperty("answerContent")
    private String answerContent;

//    /*图片*/
//    private String answerPicture;

    /*更新时间*/
    private Date updateTime;

}
