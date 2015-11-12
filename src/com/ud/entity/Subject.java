package com.ud.entity;

import java.io.Serializable;

/**
 * 科目表
 * 
 * @author Administrator
 * 
 */
public class Subject implements Serializable {

	private static final long serialVersionUID = 9041149148901652298L;
	// ID
	private int id;
	// 科目名称
	private String subjectName;
	// 科目代码
	private String subjectCode;
	// 任课老师
	private String teacher;
	// 学期
	private int term;
	// 学年
	private int termYear;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public int getTermYear() {
		return termYear;
	}

	public void setTermYear(int termYear) {
		this.termYear = termYear;
	}

}
