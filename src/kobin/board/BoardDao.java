package kobin.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kobin.util.DbcpBean;

public class BoardDao implements BoardDaoInterface {

	@Override
	public List<BoardDto> getList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<BoardDto> list = new ArrayList<>();
		String sql = "SELECT * FROM board ORDER BY boardNo DESC";

		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int boardNo = rs.getInt("boardNo");
				String memberId = rs.getString("memberId");
				String boardTitle = rs.getString("boardTitle");
				String boardContent = rs.getString("boardContent");
				String regDate = rs.getString("regDate");
				int readCount = rs.getInt("readCount");
				String boardType = rs.getString("boardType");
				String filePath = rs.getString("filePath");
				String PhotoPath = rs.getString("PhotoPath");
				
				BoardDto dto = new BoardDto();
				
				dto.setBoardNo(boardNo);
				dto.setMemberId(memberId);
				dto.setBoardTitle(boardTitle);
				dto.setBoardContent(boardContent);
				dto.setRegDate(regDate);
				dto.setReadCount(readCount);
				dto.setBoardType(boardType);
				dto.setFilePath(filePath);
				dto.setPhotoPath(PhotoPath);

				list.add(dto);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (rs != null)rs.close();
				if (pstmt != null)pstmt.close();
				if (conn != null)conn.close();
			} catch (Exception e) { }
		}

		return list;
	}

	@Override
	public BoardDto getData(int id) {
		Integer boardNo = (Integer)id;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardDto dto = new BoardDto();
		String sql = "SELECT * FROM board WHERE boardNo=? ";

		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);

			rs = pstmt.executeQuery();
			while (rs.next()) {

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
	public boolean isValid(BoardDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		boolean isValid = false;
		String sql = "SELECT * FROM board WHERE boardNo=? ";

		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getBoardNo());

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
	public boolean insert(BoardDto dto) {		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		String sql = "INSERT INTO board "
				+ "(boardNo, memberId, boardTitle, boardContent, regDate, "
				+ " readCount, boardType, filePath, PhotoPath) "
				+ "VALUES(boardNo_seq.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?, ?, ?)";
		
		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMemberId());
			pstmt.setString(2, dto.getBoardTitle());
			pstmt.setString(3, dto.getBoardContent());
			pstmt.setInt(4, dto.getReadCount());
			pstmt.setString(5, dto.getBoardType());
			pstmt.setString(6, dto.getFilePath());
			pstmt.setString(7, dto.getPhotoPath());

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
	public boolean update(BoardDto dto) {		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		String sql = "UPDATE board "
					+"   SET memberId=?, boardTitle=?, boardContent=?, "
					+"		 readCount=?, boardType=?, filePath=?, photoPath=? "
					+" WHERE boardNo=? ";
		
		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMemberId());
			pstmt.setString(2, dto.getBoardTitle());
			pstmt.setString(3, dto.getBoardContent());
			pstmt.setInt(4, dto.getReadCount());
			pstmt.setString(5, dto.getBoardType());
			pstmt.setString(6, dto.getFilePath());
			pstmt.setString(7, dto.getPhotoPath());

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
		Integer boardNo = (Integer)id;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int flag = 0;
		String sql = "DELETE FROM board WHERE boardNo=? ";
		
		try {
			conn = new DbcpBean().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);

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
