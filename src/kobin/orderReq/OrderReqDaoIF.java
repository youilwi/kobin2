package kobin.orderReq;

import java.util.List;

public interface OrderReqDaoIF {
	public List<OrderReqDto> getList();
	public OrderReqDto getData(int id);
	public boolean isValid(OrderReqDto dto);
	public boolean insert(OrderReqDto dto);
	public boolean update(OrderReqDto dto);
	public boolean delete(int id);
}
