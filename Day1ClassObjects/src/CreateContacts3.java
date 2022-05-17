
public class CreateContacts3 {

	public static void main(String[] args) {
		
		Contact3 con1 = new Contact3(2,"john",7569287979L,"john@gmail.com","Halloween.com");
		
		
		System.out.println(con1.getContactId());
		System.out.println(con1.getFirstName());
		System.out.println(con1.getMobileNo());
		System.out.println(con1.getEmail());
		System.out.println(con1.getCompany());
		
		
		con1.setMobileNo(9390420506L);
		
		//references for data members
		
		con1.setContactId(1);
		con1.setFirstName("john");
		con1.setMobileNo(7569287979L);
		con1.setEmail("john@gmail.com");
		con1.setCompany("nasdaq");
		
		System.out.println(con1.getContactId());
		System.out.println(con1.getFirstName());
		System.out.println(con1.getMobileNo());
		System.out.println(con1.getEmail());
		System.out.println(con1.getCompany());
		
		
		

	}

}
