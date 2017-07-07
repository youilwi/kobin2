package kobin.company;

import java.util.List;

public interface CompanyDaoIF {
	public List<CompanyDto> getList();
	public CompanyDto getData(int id);
	public boolean isValid(CompanyDto dto);
	public boolean insert(CompanyDto dto);
	public boolean update(CompanyDto dto);
	public boolean delete(int id);
}
