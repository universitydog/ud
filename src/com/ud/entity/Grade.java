package com.ud.entity;

import java.io.Serializable;

/**
 * 成绩表
 * 
 * @author Administrator
 * 
 */
public class Grade implements Serializable {

	private static final long serialVersionUID = 3956293258347299144L;
	// 用户id [外键]
	private int userId;
	// 科目id [外键]
	private int subjectId;
	// 成绩
	private int score;
	// 单科绩点
	private int singleGPA;
	// 创建时间
	private String createDate;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getSingleGPA() {
		return singleGPA;
	}

	public void setSingleGPA(int singleGPA) {
		this.singleGPA = singleGPA;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

}
