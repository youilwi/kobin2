package kobin.orderReq;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kobin.util.DbcpBean;

public class OrderReqDao implements OrderReqDaoIF {
	private static OrderReqDao dao;
	
	private OrderReqDao(){ }
	public static OrderReqDao getInstance(){
		if(dao==null){
			dao=new OrderReqDao();
		}
		return dao;
	}
	@Override
	public List<OrderReqDto> getList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<OrderReqDto> list = new ArrayList<>();
		String sql = "SELECT * FROM orderReq ";

		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int orderNo = rs.getInt("orderNo");
				String memberId = rs.getString("memberId");
				int workNo = rs.getInt("workNo");
				int companyNo = rs.getInt("companyNo");
				String orderTitle = rs.getString("orderTitle");
				int orderPrice = rs.getInt("orderPrice");
				int orderComm = rs.getInt("orderComm");
				String orderStatus = rs.getString("orderStatus");
				String orderResult = rs.getString("orderResult");
				String startDate = rs.getString("startDate");
				String endDate = rs.getString("endDate");
				
				OrderReqDto dto = new OrderReqDto();
				
				dto.setOrderNo(orderNo);
				dto.setMemberId(memberId);
				dto.setWorkNo(workNo);
				dto.setCompanyNo(companyNo);
				dto.setOrderTitle(orderTitle);
				dto.setOrderPrice(orderPrice);
				dto.setOrderComm(orderComm);
				dto.setOrderStatus(orderStatus);
				dto.setOrderResult(orderResult);
				dto.setStartDate(startDate);
				dto.setEndDate(endDate);

				list.add(dto);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) { }
		}

		return list;
	}

	@Override
	public OrderReqDto getData(int id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		OrderReqDto dto = null;
		String sql="select * from OrderReq where orderNo=? ";

		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				dto = new OrderReqDto();
				

				dto.setMemberId(rs.getNString("memberId"));
				dto.setWorkNo(rs.getInt("workNo"));
				dto.setCompanyNo(rs.getInt("companyNo"));
				dto.setOrderTitle(rs.getString("orderTitle"));
				dto.setOrderPrice(rs.getInt("orderPrice"));
				dto.setOrderComm(rs.getInt("orderComm"));
				dto.setOrderStatus(rs.getString("orderStatus"));
				dto.setOrderResult(rs.getString("orderResult"));
				dto.setStartDate(rs.getString("startDate"));
				dto.setEndDate(rs.getString("endDate"));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) { }
		}

		return dto;
	}

	@Override
	public boolean isValid(OrderReqDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		boolean isValid = false;
		String sql = "SELECT * FROM orderReq WHERE orderNo=? ";
		
		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getOrderNo());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				isValid = true;
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) { }
		}

		return isValid;
	}

	@Override
	public boolean insert(OrderReqDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		String sql = "INSERT INTO orderReq "
			+ "(orderNo, memberId, workNo, companyNo, orderTitle, orderPrice, "
			+ " orderComm, orderStatus, orderResult, startDate, endDate) "
			+ "VALUES(orderNo_seq.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, SYSDATE, NULL)";
		
		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMemberId());
			pstmt.setInt(2, dto.getWorkNo());
			pstmt.setInt(3, dto.getCompanyNo());
			pstmt.setString(4, dto.getOrderTitle());
			pstmt.setInt(5, dto.getOrderPrice());
			pstmt.setInt(6, dto.getOrderComm());
			pstmt.setString(7, dto.getOrderStatus());
			pstmt.setString(8, dto.getOrderResult());

			flag = pstmt.executeUpdate();
			
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) { }
		}
		
		if (flag > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean update(OrderReqDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		String sql = "UPDATE OrderReq "
				    +"   SET memberId=?, workNo=?, companyNo=?, orderTitle=?, "
				    +"		 orderPrice=?, orderComm=?, orderStatus=?, orderResult=? "
				    +" WHERE orderNo=? ";
		
		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getMemberId());
			pstmt.setInt(2, dto.getWorkNo());
			pstmt.setInt(3, dto.getCompanyNo());
			pstmt.setString(4, dto.getOrderTitle());
			pstmt.setInt(5, dto.getOrderPrice());
			pstmt.setInt(6, dto.getOrderComm());
			pstmt.setString(7, dto.getOrderStatus());
			pstmt.setString(8, dto.getOrderResult());
			pstmt.setInt(9, dto.getOrderNo());

			flag = pstmt.executeUpdate();
			
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) { }
		}
		
		if (flag > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(int id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		String sql = "DELETE FROM orderReq WHERE orderNo=? ";
		
		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);

			flag = pstmt.executeUpdate();
			
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) { }
		}
		
		if (flag > 0) {
			return true;
		} else {
			return false;
		}
	}
}
