
public class PrintingObjects {

	public static void main(String[] args) {
		
		Contact3 contact=new Contact3(1,"john",7569287979L,"john@gmail.com","nasdaq");
		System.out.println(contact.getClass().getTypeName());
		System.out.println(contact);
		

	}

}
