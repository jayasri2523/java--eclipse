package ai.jobiak.core;

import java.time.LocalDateTime;

public class CreateEmployee {

	public static void main(String[] args) {
		Address res = new Address("45123","sundaram","Hyderabad");
		Address comm = new Address("IIIT campus","Siripuram","Hyderabad");
		Employee emp = new Employee(101,"Jayasri",LocalDateTime.now(),res,comm,1); 
		
		Address resE1 = new Address("47475","balajinagar","Hyderabad");
		Address commE1 = new Address("IIIT campus","Gacchibowli","Hyderabad");
		Employee emp1 = new Employee(101,"Jayasri",LocalDateTime.now(),resE1,commE1,1); 
		
		
		Address resE2 = new Address("36748","Ongole","Ap");
		Address commE2 = new Address("IIIT campus","Siripuram","Vizag");
		Employee emp2 = new Employee(101,"Jayasri",LocalDateTime.now(),resE2,commE2,1); 
		
		Address resE3 = new Address("Firstfloor","hightechcity","Hyderabad");
		Address commE3 = new Address("IIIT campus","Siripuram","Vizag");
		Employee emp3 = new Employee(101,"Jayasri",LocalDateTime.now(),resE3,commE3,1); 
		
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		emp2.setManagerId(111);
		
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
	}

}
