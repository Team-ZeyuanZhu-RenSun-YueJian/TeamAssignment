package com.br.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.br.dao.CarDao;
import com.br.entity.Car;
import com.br.utils.JdbcUtil;

public class CarDaoImpl implements CarDao{
	
	PreparedStatement ps = null;
    Connection ct = null;
    ResultSet rs = null;
    
	@Override
	public Boolean addCar(Car car) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "INSERT INTO cartable (brand,model,seats,price,aviliable_time,car_number,belong_user,status,status_by) VALUE (?,?,?,?,?,?,?,?,?)";
			ps = ct.prepareStatement(sql);
			ps.setString(1, car.getBrand());
			ps.setString(2, car.getModel());
			ps.setString(3, car.getSeats());
			ps.setString(4, car.getPrice());
			ps.setString(5, car.getAviliableTime());
			ps.setString(6, car.getCarNumber());
			ps.setInt(7, car.getBelongUser());
			ps.setString(8, car.getStatus());
			ps.setString(9, car.getStatus_by());
			int flag = ps.executeUpdate();
			if(flag >0 ) {
				return true;
			}else {
				return false;
			}
	    }catch(Exception e) {
	        e.printStackTrace();
	        return false;
	    }finally {
	    	JdbcUtil.closeAllResource(ct, ps, rs);
	    }
	}
	
	@Override
	public Boolean deleteCar(Integer id) {
		try {
	        ct = JdbcUtil.getConnection();
			String sql = "delete from cartable where id = ?";
			ps = ct.prepareStatement(sql);
			ps.setInt(1, id);
			int flag = ps.executeUpdate();
			if(flag >0 ) {
				return true;
			}else {
				return false;
			}
	    }catch(Exception e) {
	        e.printStackTrace();
	        return false;
	    }finally {
	    	JdbcUtil.closeAllResource(ct, ps, rs);
	    }
	}
	
	@Override
	public Boolean updateCar(Car car) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "UPDATE cartable SET brand = ?,model = ?,seats = ?,price = ?,aviliable_time = ?,car_number = ?,belong_user = ?,status = ?,status_by = ? WHERE id = ?";
			ps = ct.prepareStatement(sql);
			ps.setString(1, car.getBrand());
			ps.setString(2, car.getModel());
			ps.setString(3, car.getSeats());
			ps.setString(4, car.getPrice());
			ps.setString(5, car.getAviliableTime());
			ps.setString(6, car.getCarNumber());
			ps.setInt(7, car.getBelongUser());
			ps.setString(8, car.getStatus());
			ps.setString(9, car.getStatus_by());
			ps.setInt(10, car.getId());
			int flag = ps.executeUpdate();
			if(flag >0 ) {
				return true;
			}else {
				return false;
			}
	    }catch(Exception e) {
	        e.printStackTrace();
	        return false;
	    }finally {
	    	JdbcUtil.closeAllResource(ct, ps, rs);
	    }
	}
	
	@Override
	public ResultSet selectAll() {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "select * from cartable";
			ps = ct.prepareStatement(sql);
			return ps.executeQuery();
	    }catch(Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}
	
	@Override
	public ResultSet selectSelfCar(Integer belongUser) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "select * from cartable where belong_user = ?";
			ps = ct.prepareStatement(sql);
			ps.setInt(1, belongUser);
			return ps.executeQuery();
	    }catch(Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}

	@Override
	public Car selectById(Integer id) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "select * from cartable where id = ?";
			ps = ct.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			Car c = null;
			while(rs.next()) {
				c = new Car();
				c.setId(rs.getInt("id"));
				c.setBrand(rs.getString("brand"));
				c.setModel(rs.getString("model"));
				c.setSeats(rs.getString("seats"));
				c.setPrice(rs.getString("price"));
				c.setAviliableTime(rs.getString("aviliable_time"));
				c.setCarNumber(rs.getString("car_number"));
				c.setBelongUser(rs.getInt("belong_user"));
				c.setStatus(rs.getString("status"));
				c.setStatus_by(rs.getString("status_by"));
			}
			return c;
	    }catch(Exception e) {
	        e.printStackTrace();
	        return null;
	    }finally {
	    	JdbcUtil.closeAllResource(ct, ps, rs);
	    }
	}

}
