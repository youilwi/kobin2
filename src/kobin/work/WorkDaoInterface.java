package kobin.work;

import java.util.List;

public interface WorkDaoInterface {
	public List<WorkDto> getList();
	public WorkDto getData(String id);
	public boolean isValid(WorkDto dto);
	public boolean insert(WorkDto dto);
	public boolean update(WorkDto dto);
	public boolean delete(String id);
}
