package ai.jobiak.Strings;

import java.util.Scanner;

public class LoginPage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String email = new String("patnamjayasri@gmail.com");
		String password1 = new String("jaya123");
		
		System.out.println("Enter email or phone: ");
		String username = scanner.nextLine();
		System.out.println("Enter password: ");
		String password = scanner.nextLine();
		
		
		if(email.equals(username) && password.equals(password) ) {
			System.out.println("login successfully");
		}
		else {
			System.out.println("Invalid username or pasword");
		}
		
		
	}

}
