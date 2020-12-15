package com.br.entity;

public class User {
	
	private Integer id;
	private String userNumber;				//登录账号
	private String userPassword;			//登录密码
	private String userType;				//身份
	private String userName;				//名称
	private String userDriverLicenseId;		//驾驶证
	private String userAge;					//年	龄
	private String userTel;					//电话
	private String status;				//状态a：是否被认证 【0未认证，1认证】
	private String status_by;			//状态b：是否正在接单 【0未接，1已接】
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserDriverLicenseId() {
		return userDriverLicenseId;
	}
	public void setUserDriverLicenseId(String userDriverLicenseId) {
		this.userDriverLicenseId = userDriverLicenseId;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus_by() {
		return status_by;
	}
	public void setStatus_by(String status_by) {
		this.status_by = status_by;
	}
	
	

}
