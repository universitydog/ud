package com.ud.entity;

import java.io.Serializable;

/**
 * ��Ϣ��
 * 
 * @author Administrator
 * 
 */
public class Message implements Serializable {

	private static final long serialVersionUID = -4254730238000472530L;
	// ID
	private int id;
	// ����
	private String title;
	// ����
	private String body;
	// �������û�ID [���]
	private int issueUserId;
	// �û�ID [���]
	private int userId;
	// ��� (ϵͳ��Ϣ0, ������Ϣ1, ˽����Ϣ2)
	private int sort;
	// ����ʱ��
	private String createDate;
	// �Ƿ�ɾ��
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
