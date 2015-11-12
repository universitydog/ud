package com.ud.entity;

import java.io.Serializable;

/**
 * 新闻表
 * 
 * @author Administrator
 * 
 */
public class News implements Serializable {

	private static final long serialVersionUID = -3751081326491479189L;

	// ID
	private int id;
	// 标题
	private String title;
	// 内容
	private String body;
	// 关键字
	private String keyword;
	// 浏览量
	private String pageviews;
	// 赞
	private boolean praise;
	// 坑
	private boolean pit;
	// 优先级别
	private int priorityLevel;
	// 分享次数
	private int shareNumber;
	// 所属学校ID [外键]
	private int schoolId;
	// 新闻类别
	private int newsSort;
	// 发布时间
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
