package ai.jobiak.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestEmployee {

	public static void main(String[] args) {
		
		 Map<Integer,Employee> HashMap = new HashMap<Integer,Employee>(10,0.75F);
		
		Employee emp1 = new Employee(1,"John");
		Employee emp2 = new Employee(2,"Jain");
		Employee emp3 = new Employee(3,"Jony");
		Employee emp4 = new Employee(4,"James");
		
		HashMap.put(emp1.getEmpId(), emp1);
		HashMap.put(emp2.getEmpId(), emp2);
	    HashMap.put(emp3.getEmpId(), emp3);
		HashMap.put(emp4.getEmpId(), emp4);
		
		/*Set<Map.Entry<Integer,Employee>> entries = HashMap.entrySet();
		for(Map.Entry<Integer,Employee> emp : entries) {
			System.out.println(emp.getKey());
			Employee employee=emp.getValue();
			employee.display();
			
		}*/
		
		Iterator<Integer> iterator=HashMap.keySet().iterator();
		while(iterator.hasNext()) {
			Employee emp=HashMap.get(iterator.next());
			emp.display();
		}
		

	}

}
