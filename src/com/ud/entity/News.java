package com.ud.entity;

import java.io.Serializable;

/**
 * ���ű�
 * 
 * @author Administrator
 * 
 */
public class News implements Serializable {

	private static final long serialVersionUID = -3751081326491479189L;

	// ID
	private int id;
	// ����
	private String title;
	// ����
	private String body;
	// �ؼ���
	private String keyword;
	// �����
	private String pageviews;
	// ��
	private boolean praise;
	// ��
	private boolean pit;
	// ���ȼ���
	private int priorityLevel;
	// �������
	private int shareNumber;
	// ����ѧУID [���]
	private int schoolId;
	// �������
	private int newsSort;
	// ����ʱ��
	private int issueDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getPageviews() {
		return pageviews;
	}

	public void setPageviews(String pageviews) {
		this.pageviews = pageviews;
	}

	public boolean isPraise() {
		return praise;
	}

	public void setPraise(boolean praise) {
		this.praise = praise;
	}

	public boolean isPit() {
		return pit;
	}

	public void setPit(boolean pit) {
		this.pit = pit;
	}

	public int getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(int priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public int getShareNumber() {
		return shareNumber;
	}

	public void setShareNumber(int shareNumber) {
		this.shareNumber = shareNumber;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public int getNewsSort() {
		return newsSort;
	}

	public void setNewsSort(int newsSort) {
		this.newsSort = newsSort;
	}

	public int getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(int issueDate) {
		this.issueDate = issueDate;
	}

}
