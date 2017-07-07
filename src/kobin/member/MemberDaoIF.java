package kobin.member;

import java.util.List;

public interface MemberDaoIF {
	public List<MemberDto> getList();
	public MemberDto getData(String id);
	public boolean isValid(MemberDto dto);
	public boolean insert(MemberDto dto);
	public boolean update(MemberDto dto);
	public boolean delete(String id);
}
