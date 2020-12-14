package com.br.entity;

public class Order {
	
	private String id;				//订单号
	private Integer carId;			//车
	private String neddDriver;		//是否需要司机
	private String comment;			//评价
	private Integer orderUser;		//下单人
	private String ifReturn;		//是否还车【0未还,1已还】
	private Integer orderDriver;	//司机
	private String orderComfirm;	//是否被公司确认
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public String getNeddDriver() {
		return neddDriver;
	}
	public void setNeddDriver(String neddDriver) {
		this.neddDriver = neddDriver;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getOrderUser() {
		return orderUser;
	}
	public void setOrderUser(Integer orderUser) {
		this.orderUser = orderUser;
	}
	public String getIfReturn() {
		return ifReturn;
	}
	public void setIfReturn(String ifReturn) {
		this.ifReturn = ifReturn;
	}
	public Integer getOrderDriver() {
		return orderDriver;
	}
	public void setOrderDriver(Integer orderDriver) {
		this.orderDriver = orderDriver;
	}
	public String getOrderComfirm() {
		return orderComfirm;
	}
	public void setOrderComfirm(String orderComfirm) {
		this.orderComfirm = orderComfirm;
	}

}
