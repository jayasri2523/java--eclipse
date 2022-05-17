package com.jobiak.java8;

import java.util.function.Function;

public class TestFunctionals {

	public static void main(String[] args) {
		
		Function<String,Integer> lengthFunction= (String str)->{return str.length();};
		int result=lengthFunction.apply("java");
		System.out.println(result);
		
		Function<String,String> Uppercase= (String str)->{return str.toUpperCase();};
		String result1=Uppercase.apply("program");
		System.out.println(result1);
		
		Function<String,String> Lowercase= (String str)->{return str.toLowerCase();};
		String result2=Lowercase.apply("CODE");
		System.out.println(result2);
		
		Function<String,String> concat= (String str)->{return str.concat("1234");};
		String result3=concat.apply("johnn");
		System.out.println(result3);

		Function<String,String> Replace = (String str)->{return str.replace("jaya","234");};
		String result4=Replace.apply("Jayasri");
		System.out.println(result4);
		
		

	}

}
