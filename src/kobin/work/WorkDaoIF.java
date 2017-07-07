package kobin.work;

import java.util.List;

public interface WorkDaoIF {
	public List<WorkDto> getList();
	public WorkDto getData(int id);
	public boolean isValid(WorkDto dto);
	public boolean insert(WorkDto dto);
	public boolean update(WorkDto dto);
	public boolean delete(int id);
}
