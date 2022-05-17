package ai.jobiak.StringMethods;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder builder=new StringBuilder("My Name Is Jayasri ");
		System.out.println(builder);
		System.out.println(builder.length());
		System.out.println(builder.capacity());
		System.out.println();
		
		builder.append("Patnam");
		System.out.println(builder);
		System.out.println(builder.length());
		System.out.println(builder.capacity());
		System.out.println();
		
		builder.replace(18, 25, "p");
		System.out.println(builder);
		System.out.println();
		
		builder.charAt(3);
		System.out.println(builder.charAt(3));
		System.out.println();
		
		builder.delete(8,11);
		System.out.println(builder);
		System.out.println();

		builder.deleteCharAt(12);
		System.out.println(builder);
		System.out.println(builder.length());
	    System.out.println();
	    
	    builder.insert(8,"Is");
	    System.out.println(builder);
		System.out.println();
		
		builder.replace(11, 16, "Jayasri");
		System.out.println(builder);
		System.out.println();
	    
		
		String str=builder.substring(11);
		System.out.println(builder);
		System.out.println();

		builder.reverse();
		System.out.println(builder);
		System.out.println();
		
		
		
		
		
		

	}

}
