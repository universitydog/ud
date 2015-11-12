package com.ud.entity;

import java.io.Serializable;

/**
 * 狗窝成员表
 * 
 * @author Administrator
 * 
 */
public class DogNestMember implements Serializable {

	private static final long serialVersionUID = -6237581151087779286L;
	// ID
	private int id;
	// 成员用户id [外键]
	private int memberUserId;
	// 加入时间
	private String joinDate;
	// 狗窝id [外键]
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
