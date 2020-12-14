package com.br.dao;

import java.sql.ResultSet;

import com.br.entity.Car;

public interface CarDao {

	//添加
	Boolean addCar(Car car);
	
	//删除
	Boolean deleteCar(Integer id);
	
	//修改
	Boolean updateCar(Car car);
	
	//查询所有
	ResultSet selectAll();
	
	//查询自己
	ResultSet selectSelfCar(Integer belongUser);
	
	//根据id查询
	Car selectById(Integer id);
        
        //根据座位数查询
        ResultSet selectBySeat(String beginSeat, String endSeat);
        
        //根据价格查询
        ResultSet selectByPrice(String beginPrice, String endPrice);
	
	
}
