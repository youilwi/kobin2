package kobin.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kobin.util.DbcpBean;


public class CompanyDao implements CompanyDaoIF {
	private static CompanyDao dao;
	private CompanyDao(){};
	public static CompanyDao getInstance(){
		if(dao==null){
			dao=new CompanyDao();
		}
		return dao;
	}

	public CompanyDto getData(int id){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		CompanyDto dto=null;
		String sql = "select companyName, companyCeoName, companyCeoPhone,"
				+ " workArea, workNo from company where companyNo=?";
		
		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto=new CompanyDto();
				dto.setCompanyName(rs.getString("companyName"));
				dto.setCompanyCeoname(rs.getString("companyCeoname"));
				dto.setCompanyCeoPhone(rs.getString("companyCeoPhone"));
				dto.setWorkArea(rs.getString("workArea"));
				dto.setWorkNo(rs.getInt("workNo"));
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

	public List<CompanyDto> getList(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		CompanyDto dto = null;
		List<CompanyDto> list = new ArrayList<>();
		String sql = "select * from company order by companyName asc";

		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				dto = new CompanyDto();
				
				int companyno = rs.getInt("companyNo");
				String companyname = rs.getString("companyName");
				String companyCeoName = rs.getString("companyCeoName");
				String companyCeoPhone = rs.getString("companyCeoPhone");
				String workArea = rs.getString("workArea");
				int workNo = rs.getInt("workNo");
				
				dto.setCompanyNo(companyno);
				dto.setCompanyName(companyname);
				dto.setCompanyCeoname(companyCeoName);
				dto.setCompanyCeoPhone(companyCeoPhone);
				dto.setWorkArea(workArea);
				dto.setWorkNo(workNo);

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
	public boolean isValid(CompanyDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		boolean isValid = false;
		String sql = "SELECT * FROM company WHERE companyNo=? ";

		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getCompanyNo());

			rs = pstmt.executeQuery();
			while (rs.next()) {
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

	public boolean insert(CompanyDto dto){		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		String sql = "INSERT INTO company"
				+ "(companyNo,companyName,companyCeoName,"
				+ "companyCeoPhone,workArea,workNo) values(?,?,?,?,?,?)";
		
		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getCompanyNo());
			pstmt.setString(2, dto.getCompanyName());
			pstmt.setString(3, dto.getCompanyCeoname());
			pstmt.setString(4, dto.getCompanyCeoPhone());
			pstmt.setString(5, dto.getWorkArea());
			pstmt.setInt(6, dto.getWorkNo());
			
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
	public boolean update(CompanyDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		String sql = "UPDATE company "
					+"   SET companyName=?, companyCeoName=?, companyCeoPhone=?, "
					+"		 workArea=?, workNo=? "
					+" WHERE companyNo=? ";
		
		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getCompanyName());
			pstmt.setString(2, dto.getCompanyCeoname());
			pstmt.setString(3, dto.getCompanyCeoPhone());
			pstmt.setString(4, dto.getWorkArea());
			pstmt.setInt(5, dto.getWorkNo());
			pstmt.setInt(6, dto.getCompanyNo());
			
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
	
	public boolean delete(int id){
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		String sql = "delete from company where companyNo=?";
		
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

