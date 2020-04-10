package com.zzl.laoban_back.daoobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class Question {

    @Id
    @GeneratedValue
    private Integer questionId;

    /*标题*/
    private String questionTitle;

    /*内容*/
    private String questionContent;

    /*类别*/
    private Integer questionCategory;

    /*图片*/
    private String questionPicture;

    /*更新时间*/
    private Date updateTime;
}
