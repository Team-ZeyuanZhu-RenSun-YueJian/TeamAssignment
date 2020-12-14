package com.br.dao;

import java.sql.ResultSet;

import com.br.entity.User;

public interface UserDao {
	
	//添加
	Boolean addUser(User user);
	
	//删除
	Boolean deleteUser(Integer id);
	
	//按类别查询所有
	ResultSet selectAllByType(String userType);
	
	//登录查询
	User selectByLogin(String userNumber, String userPassword, String userType);
	
	//根据id查询
	User selectById(Integer id);
	
	//根据账号查询
	User selectByNumber(String userNumber, String userType);
	
	//修改
	Boolean updateUser(User u);
	

}
