package com.ud.entity;

import java.io.Serializable;

/**
 * ѧУ��
 * @author Administrator
 *
 */
public class School implements Serializable {

	private static final long serialVersionUID = -2889035089533977365L;
	//ID
	private int id;
	//ѧУ����
	private String schoolCode;
	//ѧУ����
	private String schoolName;
	//���ڳ���
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
