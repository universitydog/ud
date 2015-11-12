package com.ud.entity;

import java.io.Serializable;

/**
 * 消息表
 * 
 * @author Administrator
 * 
 */
public class Message implements Serializable {

	private static final long serialVersionUID = -4254730238000472530L;
	// ID
	private int id;
	// 标题
	private String title;
	// 内容
	private String body;
	// 发布者用户ID [外键]
	private int issueUserId;
	// 用户ID [外键]
	private int userId;
	// 类别 (系统消息0, 狗窝消息1, 私聊消息2)
	private int sort;
	// 创建时间
	private String createDate;
	// 是否删除
	private boolean isDelete;

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

	public int getIssueUserId() {
		return issueUserId;
	}

	public void setIssueUserId(int issueUserId) {
		this.issueUserId = issueUserId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

}
