package com.zzl.laoban_back.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

@Data
@DynamicUpdate
public class QuestionVO {

    @JsonProperty("id")
    private Integer questionId;

    /*标题*/
    @JsonProperty("title")
    private String questionTitle;

    /*内容*/
    @JsonProperty("content")
    private String questionContent;

//    /*类别*/
//    private Integer questionCategory;

    /*图片*/
    @JsonProperty("picture")
    private String questionPicture;

    /*更新时间*/
    private Date updateTime;
}
