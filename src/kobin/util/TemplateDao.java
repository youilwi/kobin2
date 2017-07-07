package kobin.util;

import java.util.List;

public interface TemplateDao {
	public List<Object> getList();
	public Object getData(Object id);
	public boolean isValid(Object obj);
	public boolean insert(Object obj);
	public boolean update(Object obj);
	public boolean delete(Object id);
}
