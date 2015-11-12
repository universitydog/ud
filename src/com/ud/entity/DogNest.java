package com.ud.entity;

import java.io.Serializable;

/**
 * 狗窝表
 * 
 * @author Administrator
 * 
 */
public class DogNest implements Serializable {

	private static final long serialVersionUID = 4778274362158568315L;
	// ID
	private int ID;
	// 窝名
	private String nestName;
	// 类别
	private int sort;
	// 描述
	private String describe;
	// 是否删除
	private boolean isDelete;
	// 创建者用户id [外键]
	private int createUserId;
	// 级别 (窝的等级)
	private int level;
	// 创建时间
	private String createDate;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNestName() {
		return nestName;
	}

	public void setNestName(String nestName) {
		this.nestName = nestName;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	public int getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(int createUserId) {
		this.createUserId = createUserId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

}
