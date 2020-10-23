package com.nicai.hiactivity.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * .
 * 实体类
 *
 * @author typhoon
 */
@Data
public class Activity {

  /**
   * .
   * id
   */
  private Integer id;

  /**
   * .
   * 标题
   */
  private String title;

  /**
   * .
   * 类别
   */
  private String category;

  /**
   * .
   * 开始时间
   * DateTimeFormat作用于set方法，基于什么格式实现
   * JsonFormat 告诉Spring MVC 转化为JSON时，基于什么格式实现
   * JsonFormat 作用于get方式时，表示取值时是什么格式
   */
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
  @JsonFormat(pattern = "yyyy/MM/dd HH:mm")
  private Date startTime;

  /**
   * .
   * 结束时间
   */
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
  @JsonFormat(pattern = "yyyy/MM/dd HH:mm")
  private Date endTime;

  /**
   * .
   * 评论
   */
  private String remark;

  /**
   * .
   * 状态
   */
  private String state;

  /**
   * .
   * 创建时间
   */
  @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
  private Date createdTime;

  /**
   * .
   * 创建用户
   */
  private String createdUser;
}
