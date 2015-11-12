package com.ud.entity;

import java.io.Serializable;

/**
 * 用户表
 * 
 * @author Administrator
 * 
 */
public class User implements Serializable {

	private static final long serialVersionUID = -4353526750903108959L;
	// ID
	private int userId;
	// 姓名
	private String name;
	// 学号
	private String studentID;
	// 性别
	private String sex;
	// 班级
	private String classGrade;
	// 专业
	private String major;
	// 学院
	private String college;
	// 所属学校id [外键]
	private int schoolId;
	// 头像
	private String headImg;
	// 个人签名
	private String signature;
	// 类别
	private String type;
	// 昵称
	private String nickName;
	// 邮箱
	private String email;
	// 账户名
	private String accountName;
	// 密码
	private String password;
	/**
	 * 创建时间
	 */
	private String createDate;
	// 个人信息是否完整
	private boolean isWholeInfo;
	

}
