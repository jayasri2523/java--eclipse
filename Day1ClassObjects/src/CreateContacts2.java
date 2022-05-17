
public class CreateContacts2 {

	public static void main(String[] args) {
		
		Contact2 con1 = new Contact2();
		
		System.out.println(con1.getContactId());
		System.out.println(con1.getFirstName());
		System.out.println(con1.getMobileNo());
		System.out.println(con1.getEmail());
		System.out.println(con1.getCompany());
		
		
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
