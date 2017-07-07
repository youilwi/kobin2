package kobin.board;

import java.util.List;

public interface BoardDaoIF {
	public List<BoardDto> getList();
	public BoardDto getData(int id);
	public boolean isValid(BoardDto dto);
	public boolean insert(BoardDto dto);
	public boolean update(BoardDto dto);
	public boolean delete(int id);
}
