package com.br.entity;

public class Car{
	
	private Integer id;
	private String brand;				//品牌
	private String model;				//车型
	private String seats;				//座位数
	private String price;				//价格/天
	private String aviliableTime;		//起始日期
	private String carNumber;			//车牌号
	private Integer belongUser;			//属于用户
	private String status;				//状态a：是否被认证 【0未认证，1认证】
	private String status_by;			//状态b：是否正在被使用 【0未使用，1使用】
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAviliableTime() {
		return aviliableTime;
	}
	public void setAviliableTime(String aviliableTime) {
		this.aviliableTime = aviliableTime;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public Integer getBelongUser() {
		return belongUser;
	}
	public void setBelongUser(Integer belongUser) {
		this.belongUser = belongUser;
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
