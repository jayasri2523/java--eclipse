package ai.jobiak.choclatecode;

public class Details {
	String Name;
	Long MobileNo;
	Long AadharNo;
	String PanNo;
	public Details(String name, Long mobileNo, Long aadharNo, String panNo) {
		super();
		Name = name;
		MobileNo = mobileNo;
		AadharNo = aadharNo;
		PanNo = panNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		MobileNo = mobileNo;
	}
	public Long getAadharNo() {
		return AadharNo;
	}
	public void setAadharNo(Long aadharNo) {
		AadharNo = aadharNo;
	}
	public String getPanNo() {
		return PanNo;
	}
	public void setPanNo(String panNo) {
		PanNo = panNo;
	}
	@Override
	public String toString() {
		return "Details [Name=" + Name + ", MobileNo=" + MobileNo + ", AadharNo=" + AadharNo + ", PanNo=" + PanNo + "]";
	}
	
	

}
