package kobin.orderReq;

public class OrderReqDto {
	private int orderNo;
	private String memberId;
	private int workNo;
	private int companyNo;
	private String orderTitle;
	private int orderPrice;
	private int orderComm;
	private String orderStatus;
	private String orderResult;
	private String startDate;
	private String enddate;
	
	public OrderReqDto(){ }
	
	public OrderReqDto(int orderNo, String memberId, int workNo, int companyNo, 
			String orderTitle, int orderPrice, int orderComm, String orderStatus, 
			String orderResult, String startDate, String enddate) {
		super();
		this.orderNo = orderNo;
		this.memberId = memberId;
		this.workNo = workNo;
		this.companyNo = companyNo;
		this.orderTitle = orderTitle;
		this.orderPrice = orderPrice;
		this.orderComm = orderComm;
		this.orderStatus = orderStatus;
		this.orderResult = orderResult;
		this.startDate = startDate;
		this.enddate = enddate;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getWorkNo() {
		return workNo;
	}
	public void setWorkNo(int workNo) {
		this.workNo = workNo;
	}
	public int getCompanyNo() {
		return companyNo;
	}
	public void setCompanyNo(int companyNo) {
		this.companyNo = companyNo;
	}
	public String getOrderTitle() {
		return orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public int getOrderComm() {
		return orderComm;
	}
	public void setOrderComm(int orderComm) {
		this.orderComm = orderComm;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderResult() {
		return orderResult;
	}
	public void setOrderResult(String orderResult) {
		this.orderResult = orderResult;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
}
