
public class CreateContacts {

	public static void main(String[] args) {
		
		Contact con1 = new Contact();
		
		System.out.println(con1.contactId);
		System.out.println(con1.firstName);
		System.out.println(con1.mobileNo);
		System.out.println(con1.email);
		System.out.println(con1.company);
		
		
		//references for data members
		
		con1.contactId=1;
		con1.firstName="john";
		con1.mobileNo=7569287979L;
		con1.email="john@gmail.com";
		con1.company="nasdaq";
		
		System.out.println(con1.contactId);
		System.out.println(con1.firstName);
		System.out.println(con1.mobileNo);
		System.out.println(con1.email);
		System.out.println(con1.company);
		
		
		

	}

}
