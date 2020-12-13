package com.br.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.br.dao.UserDao;
import com.br.entity.User;
import com.br.utils.JdbcUtil;

public class UserDaoImpl implements UserDao {
	
	PreparedStatement ps = null;
    Connection ct = null;
    ResultSet rs = null;

	@Override
	public Boolean addUser(User user) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "INSERT INTO usertable (user_number,user_password,user_name,user_driver_license_id,user_age,user_tel,status,status_by,user_type) VALUE (?,?,?,?,?,?,?,?,?)";
			ps = ct.prepareStatement(sql);
			ps.setString(1, user.getUserNumber());
			ps.setString(2, user.getUserPassword());
			ps.setString(3, user.getUserName());
			ps.setString(4, user.getUserDriverLicenseId());
			ps.setString(5, user.getUserAge());
			ps.setString(6, user.getUserTel());
			ps.setString(7, user.getStatus());
			ps.setString(8, user.getStatus_by());
			ps.setString(9, user.getUserType());
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
	public Boolean deleteUser(Integer id) {
		try {
	        ct = JdbcUtil.getConnection();
			String sql = "delete from usertable where id = ?";
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
	public ResultSet selectAllByType(String userType) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "select * from usertable where user_type = ?";
			ps = ct.prepareStatement(sql);
			ps.setString(1, userType);
			return ps.executeQuery();
	    }catch(Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}

	@Override
	public User selectByLogin(String userNumber, String userPassword, String userType) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "select * from usertable where user_number = ? and user_password = ? and user_type = ?";
			ps = ct.prepareStatement(sql);
			ps.setString(1, userNumber);
			ps.setString(2, userPassword);
			ps.setString(3, userType);
			rs = ps.executeQuery();
			User u = null;
			while(rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setUserNumber(rs.getString("user_number"));
				u.setUserPassword(rs.getString("user_password"));
				u.setUserName(rs.getString("user_name"));
				u.setUserDriverLicenseId(rs.getString("user_driver_license_id"));
				u.setUserAge(rs.getString("user_age"));
				u.setUserTel(rs.getString("user_tel"));
				u.setUserType(rs.getString("user_type"));
				u.setStatus(rs.getString("status"));
				u.setStatus_by(rs.getString("status_by"));
			}
			return u;
	    }catch(Exception e) {
	        e.printStackTrace();
	        return null;
	    }finally {
	    	JdbcUtil.closeAllResource(ct, ps, rs);
	    }
	}

	@Override
	public User selectById(Integer id) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "select * from usertable where id = ?";
			ps = ct.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			User u = null;
			while(rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setUserNumber(rs.getString("user_number"));
				u.setUserPassword(rs.getString("user_password"));
				u.setUserName(rs.getString("user_name"));
				u.setUserDriverLicenseId(rs.getString("user_driver_license_id"));
				u.setUserAge(rs.getString("user_age"));
				u.setUserTel(rs.getString("user_tel"));
				u.setStatus(rs.getString("status"));
				u.setStatus_by(rs.getString("status_by"));
				u.setUserType(rs.getString("user_type"));
			}
			return u;
	    }catch(Exception e) {
	        e.printStackTrace();
	        return null;
	    }finally {
	    	JdbcUtil.closeAllResource(ct, ps, rs);
	    }
	}

	@Override
	public User selectByNumber(String userNumber, String userType) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "select * from usertable where user_number = ? and user_type = ?";
			ps = ct.prepareStatement(sql);
			ps.setString(1, userNumber);
			ps.setString(2, userType);
			rs = ps.executeQuery();
			User u = null;
			while(rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setUserNumber(rs.getString("user_number"));
				u.setUserPassword(rs.getString("user_password"));
				u.setUserName(rs.getString("user_name"));
				u.setUserDriverLicenseId(rs.getString("user_driver_license_id"));
				u.setUserAge(rs.getString("user_age"));
				u.setUserTel(rs.getString("user_tel"));
				u.setStatus(rs.getString("status"));
				u.setStatus_by(rs.getString("status_by"));
				u.setUserType(rs.getString("user_type"));
			}
			return u;
	    }catch(Exception e) {
	        e.printStackTrace();
	        return null;
	    }finally {
	    	JdbcUtil.closeAllResource(ct, ps, rs);
	    }
	}

	@Override
	public Boolean updateUser(User u) {
		try {
			ct = JdbcUtil.getConnection();
			String sql = "UPDATE usertable SET user_number = ?,user_password = ?,user_name = ?,user_driver_license_id = ?,user_age = ?,user_tel = ?,status = ?,status_by = ?,user_type  = ? WHERE id = ?";
			ps = ct.prepareStatement(sql);
			ps.setString(1, u.getUserNumber());
			ps.setString(2, u.getUserPassword());
			ps.setString(3, u.getUserName());
			ps.setString(4, u.getUserDriverLicenseId());
			ps.setString(5, u.getUserAge());
			ps.setString(6, u.getUserTel());
			ps.setString(7, u.getStatus());
			ps.setString(8, u.getStatus_by());
			ps.setString(9, u.getUserType());
			ps.setInt(10, u.getId());
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

}
