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
	/**
	 *  ID
	 */
	private int id;
	/**
	 *  ��Ա-�û�id [���]
	 */
	private int userId;
	/**
	 *  ����ʱ��
	 */
	private String joinDate;
	/**
	 *  ����id [���]
	 */
	private int dogNestId;
	/**
	 *  ���״̬��0������У�1ͨ����2�ܾ�
	 */
	private String checkType;

	

}
