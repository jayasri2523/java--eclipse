package ai.jobiak.core;

import java.time.LocalDateTime;

public class CreateEmployees {

	public static void main(String[] args) {
		
		Address res = new Address("45123","balajinagar","Vizag");
		Address comm = new Address("Poineer","Siripuram","Vizag");
		Employee emp = new Employee(101,"Jayasri",LocalDateTime.now(),res,comm,1); 
		
		System.out.println(emp);
		
		System.out.println(emp);
		System.out.println(emp.getResidance());
		System.out.println(emp.getCommunication());
		

	}

}
