package kobin.company;

public class CompanyDto {
	private int companyNo;
	private String companyName;
	private String companyCeoname;
	private String companyCeoPhone;
	private String workArea;
	private int workNo;
	
	public CompanyDto(){}

	public CompanyDto(int companyNo, String companyName, String companyCeoname, 
			String companyCeoPhone, String workArea,int workNo) {
		super();
		this.companyNo = companyNo;
		this.companyName = companyName;
		this.companyCeoname = companyCeoname;
		this.companyCeoPhone = companyCeoPhone;
		this.workArea = workArea;
		this.workNo = workNo;
	}

	public int getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(int companyNo) {
		this.companyNo = companyNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCeoname() {
		return companyCeoname;
	}

	public void setCompanyCeoname(String companyCeoname) {
		this.companyCeoname = companyCeoname;
	}

	public String getCompanyCeoPhone() {
		return companyCeoPhone;
	}

	public void setCompanyCeoPhone(String companyCeoPhone) {
		this.companyCeoPhone = companyCeoPhone;
	}

	public String getWorkArea() {
		return workArea;
	}

	public void setWorkArea(String workArea) {
		this.workArea = workArea;
	}

	public int getWorkNo() {
		return workNo;
	}

	public void setWorkNo(int workNo) {
		this.workNo = workNo;
	}

}