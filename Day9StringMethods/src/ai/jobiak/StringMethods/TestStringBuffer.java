package ai.jobiak.StringMethods;

import java.util.Scanner;

public class TestStringBuffer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer buffer=new StringBuffer("hai hello");
		char key='h';
		int count=0;
		for(int i=0;i<buffer.length();i++) {
			if(buffer.charAt(i)==key) {
				count++;
		}
	}
		System.out.println("The Occurance of "+key+" is "+count);
		System.out.println();
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		buffer.append(" #HAI ");
		buffer.append(23.67);
		System.out.println(buffer);
		System.out.println();
		
		buffer.insert(3,"#Hello");
		System.out.println(buffer);
		
		buffer.replace(0,4,"Hi");
		System.out.println(buffer);
		System.out.println();
		
		buffer.insert(2,"@#");
		System.out.println(buffer);
		System.out.println();
		
		String str=buffer.substring(2,9);
		System.out.println(buffer);
		System.out.println();
		
		buffer.replace(16, 27, "GoodMorning");
		System.out.println(buffer);
		System.out.println();
		
		int cp=buffer.codePointCount(2,12);
		System.out.println(buffer);
		System.out.println();
		
		buffer.delete(3, 10);
		System.out.println(buffer);
		System.out.println();
		
		buffer.reverse();
		System.out.println(buffer);
		System.out.println();
		
		System.out.println(buffer.length());
		
	}
}
