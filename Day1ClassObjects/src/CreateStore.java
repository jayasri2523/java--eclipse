
public class CreateStore {

	public static void main(String[] args) {
		
		StoreContacts store=new StoreContacts();
		
		Contact3 con1 = new Contact3(2,"john",7569287979L,"john@gmail.com","Halloween.com");
		Contact3 con2 = new Contact3(2,"john",7569287979L,"john@gmail.com","Monster.com");
		Contact3 con3 = new Contact3(2,"john",7569287979L,"john@gmail.com","HorrorTimes.com");
		
		Contact3 contact3Array[]=new Contact3[3];
		contact3Array[0]=con1;
		contact3Array[1]=con1;
		contact3Array[2]=con1;
		
		store.setContacts(contact3Array);
		System.out.println(store);
		
		Contact3 contacts[]=store.getContacts();
		for(Contact3 Contact:contacts ) {
			System.out.println(Contact);
			
		}
		
		
		
	}

}
