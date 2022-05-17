
public class ComparingObjects {

	public static void main(String[] args) {
		
		Contact2 Contact1=new Contact2();
		Contact2 Contact2=new Contact2();
		
		boolean result=(Contact1 == Contact2);
		System.out.println(result);
		
		result=(Contact1.hashCode()==Contact2.hashCode());
		System.out.println(result);
		
		Contact2 contact3=Contact1;
		
	   result=(Contact1 == contact3);
		System.out.println(result);

		result=(contact3.hashCode()==Contact1.hashCode());
		System.out.println(result);
		
		
		
		
		
		
		
		
		

	}

}
