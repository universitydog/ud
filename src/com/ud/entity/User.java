package com.ud.entity;

import java.io.Serializable;

/**
 * �û���
 * 
 * @author Administrator
 * 
 */
public class User implements Serializable {

	private static final long serialVersionUID = -4353526750903108959L;
	// ID
	private int userId;
	// ����
	private String name;
	// ѧ��
	private String studentID;
	// �Ա�
	private String sex;
	// �༶
	private String classGrade;
	// רҵ
	private String major;
	// ѧԺ
	private String college;
	// ����ѧУid [���]
	private int schoolId;
	// ͷ��
	private String headImg;
	// ����ǩ��
	private String signature;
	// ���
	private String type;
	// �ǳ�
	private String nickName;
	// ����
	private String email;
	// �˻���
	private String accountName;
	// ����
	private String password;
	/**
	 * ����ʱ��
	 */
	private String createDate;
	// ������Ϣ�Ƿ�����
	private boolean isWholeInfo;
	

}
