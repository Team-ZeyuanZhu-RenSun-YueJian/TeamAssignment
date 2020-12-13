package com.br.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.br.dao.OrderDao;
import com.br.entity.Order;
import com.br.utils.JdbcUtil;

public class OrderDaoImpl implements OrderDao {
	
	PreparedStatement ps = null;
    Connection ct = null;
    ResultSet rs = null;
    
	@Override
	public Boolean addOrder(Order order) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "INSERT INTO ordertable (id,car_id,need_driver,comment,order_user,if_return,order_comfirm) VALUE (?,?,?,?,?,?,?)";
			ps = ct.prepareStatement(sql);
			ps.setString(1, order.getId());
			ps.setInt(2, order.getCarId());
			ps.setString(3, order.getNeddDriver());
			ps.setString(4, order.getComment());
			ps.setInt(5, order.getOrderUser());
			ps.setString(6, order.getIfReturn());
			ps.setString(7, order.getOrderComfirm());
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
	public Boolean deleteOrder(String id) {
		try {
	        ct = JdbcUtil.getConnection();
			String sql = "delete from ordertable where id = ?";
			ps = ct.prepareStatement(sql);
			ps.setString(1, id);
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
	public ResultSet selectSelfOrder(Integer orderUser) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "select * from ordertable o left join cartable c on o.car_id = c.id left join usertable u on u.id = o.order_user where o.order_user = ?";
			ps = ct.prepareStatement(sql);
			ps.setInt(1, orderUser);
			return ps.executeQuery();
	    }catch(Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}
	
	@Override
	public ResultSet selectAll() {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "select * from ordertable o left join cartable c on o.car_id = c.id left join usertable u on u.id = o.order_user";
			ps = ct.prepareStatement(sql);
			return ps.executeQuery();
	    }catch(Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}

	@Override
	public Boolean updateComment(String id, String comment) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "UPDATE ordertable SET comment = ? WHERE id = ?";
			ps = ct.prepareStatement(sql);
			ps.setString(1, comment);
			ps.setString(2, id);
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
	public Order selectById(String id) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "select * from ordertable where id = ?";
			ps = ct.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			Order o = null;
			while(rs.next()) {
				o = new Order();
				o.setId(rs.getString("id"));
				o.setComment(rs.getString("comment"));
				o.setCarId(rs.getInt("car_id"));
				o.setNeddDriver(rs.getString("need_driver"));
				o.setOrderDriver(rs.getInt("order_driver"));
			}
			return o;
	    }catch(Exception e) {
	        e.printStackTrace();
	        return null;
	    }finally {
	    	JdbcUtil.closeAllResource(ct, ps, rs);
	    }
	}

	@Override
	public Boolean updateReturn(String id, String ifReturn) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "UPDATE ordertable SET if_return = ? WHERE id = ?";
			ps = ct.prepareStatement(sql);
			ps.setString(1, ifReturn);
			ps.setString(2, id);
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
	public Boolean updateComfirm(String id, String comfirm) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "UPDATE ordertable SET order_comfirm = ? WHERE id = ?";
			ps = ct.prepareStatement(sql);
			ps.setString(1, comfirm);
			ps.setString(2, id);
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
	public Boolean updateDriver(String id, Integer orderDriver) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "UPDATE ordertable SET order_driver = ? WHERE id = ?";
			ps = ct.prepareStatement(sql);
			ps.setInt(1, orderDriver);
			ps.setString(2, id);
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
	public ResultSet selectSelfDriver(Integer orderDriver) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "select * from ordertable o left join cartable c on o.car_id = c.id left join usertable u on u.id = o.order_user where o.order_driver = ?";
			ps = ct.prepareStatement(sql);
			ps.setInt(1, orderDriver);
			return ps.executeQuery();
	    }catch(Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}

}
