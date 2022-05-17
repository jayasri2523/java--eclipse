package ai.jobiak.maps;

public class Employee {
	
	private int empId;
	private String empname;

	public Employee(int empId, String empname) {
		super();
		this.empId = empId;
		this.empname = empname;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public void display() {
		System.out.println("Emp Id :"+getEmpId()+" EmpName: "+getEmpname());
	}
}
	
	


