package com.zzl.laoban_back.daoobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class Answer {

    @Id
    @GeneratedValue
    private Integer answerId;

    /*问题id*/
    private Integer questionId;

    /*内容*/
    private String answerContent;

    /*图片*/
    private String answerPicture;

    /*更新时间*/
    private Date updateTime;

}
