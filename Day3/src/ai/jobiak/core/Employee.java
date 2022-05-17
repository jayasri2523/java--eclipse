package ai.jobiak.core;
import java.time.LocalDateTime;

public class Employee {
	int empid;
	String fullName;
	LocalDateTime dateOfJoining;
	Address residance;
	Address Communication;
	static int managerId;
	
	public Employee() {
	}

	public Employee(int empid, String fullName, LocalDateTime dateOfJoining, Address residance, Address communication, int i) {
		super();
		this.empid = empid;
		this.fullName = fullName;
		this.dateOfJoining = dateOfJoining;
		this.residance = residance;
		Communication = communication;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDateTime getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDateTime dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Address getResidance() {
		return residance;
	}

	public void setResidance(Address residance) {
		this.residance = residance;
	}

	public Address getCommunication() {
		return Communication;
	}

	public void setCommunication(Address communication) {
		Communication = communication;
	}

	public static int getManagerId() {
		return managerId;
	}

	public static void setManagerId(int managerId) {
		Employee.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fullName=" + fullName + ", dateOfJoining=" + dateOfJoining
				+ ", residance=" + residance + ", Communication=" + Communication + "]";
	}
	
		


}
