package kobin.work;

public class WorkDto {
	private int workNo;
	private String workName;
	private String workDesc;
	
	public WorkDto(){ }
	
	public WorkDto(int workNo, String workName, String workDesc) {
		super();
		this.workNo = workNo;
		this.workName = workName;
		this.workDesc = workDesc;
	}
	
	public int getWorkNo() {
		return workNo;
	}
	public void setWorkNo(int workNo) {
		this.workNo = workNo;
	}
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	public String getWorkDesc() {
		return workDesc;
	}
	public void setWorkDesc(String workDesc) {
		this.workDesc = workDesc;
	}
}
