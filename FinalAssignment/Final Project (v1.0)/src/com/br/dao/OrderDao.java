package com.br.dao;

import java.sql.ResultSet;

import com.br.entity.Order;

public interface OrderDao {
	
	//添加
	Boolean addOrder(Order order);
	
	//删除
	Boolean deleteOrder(String id);
	
	//查询自己的订单
	ResultSet selectSelfOrder(Integer orderUser);
	
	//查询所有订单
	ResultSet selectAll();
	
	//添加评论
	Boolean updateComment(String id, String comment);
	
	//根据id查询
	Order selectById(String id);
	
	//还车修改
	Boolean updateReturn(String id, String ifReturn);
	
	//确认订单
	Boolean updateComfirm(String id, String comfirm);
	
	//司机接单
	Boolean updateDriver(String id, Integer orderDriver);
	
	//查询司机自己的订单
	ResultSet selectSelfDriver(Integer orderDriver);

}
