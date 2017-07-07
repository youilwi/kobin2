package kobin.work;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kobin.util.DbcpBean;

public class WorkDao implements WorkDaoIF{
	private static WorkDao dao;
	private WorkDao(){};
	public static WorkDao getInstance(){
		if(dao==null){
			dao=new WorkDao();
		}
		return dao;
	}
	
	@Override
	public List<WorkDto> getList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		WorkDto dto = null;
		List<WorkDto> list = new ArrayList<>();
		String sql = "SELECT * FROM work ORDER BY workName asc";

		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				dto = new WorkDto();
				
				int workno = rs.getInt("workNo");
				String workName = rs.getString("workName");
				String workDesc = rs.getString("workDesc");
				
				dto.setWorkNo(workno);
				dto.setWorkName(workName);
				dto.setWorkDesc(workDesc);

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
	public WorkDto getData(int id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		WorkDto dto=null;
		String sql = "SELECT workName, workDesc FROM work WHERE workNo=?";
		
		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto=new WorkDto();
				dto.setWorkName(rs.getString("workName"));
				dto.setWorkDesc(rs.getString("workDesc"));
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
	public boolean isValid(WorkDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		boolean isValid = false;
		String sql = "SELECT * FROM work WHERE workNo=? ";

		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getWorkNo());
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

	@Override
	public boolean insert(WorkDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		String sql = "INSERT INTO work (workNo, workName, workDesc) "
					+"VALUES (?, ?, ?) ";
		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getWorkNo());
			pstmt.setString(2, dto.getWorkName());
			pstmt.setString(3, dto.getWorkDesc());
			
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
	public boolean update(WorkDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		String sql = "UPDATE work "
					+"   SET workName=?, workDesc=?"
					+" WHERE companyNo=? ";
		
		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getWorkName());
			pstmt.setString(2, dto.getWorkDesc());
			pstmt.setInt(3, dto.getWorkNo());
			
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
		String sql = "DELETE from work WHERE workNo=?";
		
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
