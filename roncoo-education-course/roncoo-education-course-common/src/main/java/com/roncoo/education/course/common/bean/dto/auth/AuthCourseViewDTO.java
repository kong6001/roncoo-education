package com.roncoo.education.course.common.bean.dto.auth;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.roncoo.education.course.common.bean.dto.CourseChapterDTO;
import com.roncoo.education.user.common.bean.dto.auth.AuthLecturerDTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 课程信息
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class AuthCourseViewDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 讲师用户编码
	 */
	@ApiModelProperty(value = "讲师用户编码")
	private Long lecturerUserNo;
	/**
	 * 是否免费：1免费，0收费
	 */
	@ApiModelProperty(value = "是否免费：1免费，0收费")
	private Integer isFree;
	/**
	 * 购买人数
	 */
	@ApiModelProperty(value = "购买人数")
	private Integer countBuy;
	/**
	 * 学习人数
	 */
	@ApiModelProperty(value = "学习人数")
	private Integer countStudy;
	/**
	 * 总课时数
	 */
	@ApiModelProperty(value = "总课时数")
	private Integer periodTotal;
	/**
	 * 课程名称
	 */
	@ApiModelProperty(value = "课程名称")
	private String courseName;
	/**
	 * 课程封面
	 */
	@ApiModelProperty(value = "课程封面")
	private String courseLogo;
	/**
	 * 课程原价
	 */
	@ApiModelProperty(value = "课程原价")
	private BigDecimal courseOriginal;
	/**
	 * 课程优惠价
	 */
	@ApiModelProperty(value = "课程优惠价")
	private BigDecimal courseDiscount;
	/**
	 * 课程介绍
	 */
	@ApiModelProperty(value = "课程介绍")
	private String introduce;

	/**
	 * 讲师信息
	 */
	@ApiModelProperty(value = "讲师信息")
	private AuthLecturerDTO authLecturerDTO;
	/**
	 * 章节信息
	 */
	@ApiModelProperty(value = "章节信息")
	private List<CourseChapterDTO> courseChapterList;
	/**
	 * 课程学习进度
	 */
	@ApiModelProperty(value = "课程学习进度")
	private AuthCourseUserStudyLogDTO authCourseUserStudyLog;
}