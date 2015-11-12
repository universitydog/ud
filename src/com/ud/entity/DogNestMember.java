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
	/**
	 *  ID
	 */
	private int id;
	/**
	 *  成员-用户id [外键]
	 */
	private int userId;
	/**
	 *  加入时间
	 */
	private String joinDate;
	/**
	 *  狗窝id [外键]
	 */
	private int dogNestId;
	/**
	 *  审核状态，0，审核中，1通过，2拒绝
	 */
	private String checkType;

	

}
