package com.ud.entity;

import java.io.Serializable;

/**
 * ���ѳ�Ա��
 * 
 * @author Administrator
 * 
 */
public class DogNestMember implements Serializable {

	private static final long serialVersionUID = -6237581151087779286L;
	// ID
	private int id;
	// ��Ա�û�id [���]
	private int memberUserId;
	// ����ʱ��
	private String joinDate;
	// ����id [���]
	private int dogNestId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMemberUserId() {
		return memberUserId;
	}

	public void setMemberUserId(int memberUserId) {
		this.memberUserId = memberUserId;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public int getDogNestId() {
		return dogNestId;
	}

	public void setDogNestId(int dogNestId) {
		this.dogNestId = dogNestId;
	}

}
