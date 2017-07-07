package kobin.orderReq;

import java.util.List;

public interface OrderReqDaoInterface {
	public List<OrderReqDto> getList();
	public OrderReqDto getData(String id);
	public boolean isValid(OrderReqDto dto);
	public boolean insert(OrderReqDto dto);
	public boolean update(OrderReqDto dto);
	public boolean delete(String id);
}
