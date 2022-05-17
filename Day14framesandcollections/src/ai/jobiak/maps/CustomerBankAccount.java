package ai.jobiak.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerBankAccount {

	public static void main(String[] args) {
		Map<Customer,BankAccount> map=new HashMap<>();
		
		Customer c1=new Customer(1,"John");
		Customer c2=new Customer(2,"Jain");
		Customer c3=new Customer(3,"James");
		
		BankAccount b1=new BankAccount(1234,18900,c1);
		BankAccount b2=new BankAccount(1234,45900,c2);
		BankAccount b3=new BankAccount(1234,20900,c3);
		
		map.put(c1, b1);
		map.put(c2, b2);
		map.put(c3, b3);
		
		Customer temp=new Customer(1,"John");
		Customer temp1=new Customer(2,"James");
		Customer temp2=new Customer(3,"Jain");
		
		BankAccount tempAccount=map.get(temp);
		System.out.println("Customer Account details:");
		System.out.print(tempAccount.getAccountCus().getCustomerId()+ " ");
		System.out.print(tempAccount.getAccountCus().getCustomerName()+ " ");
		System.out.println(tempAccount.getAccountbal());
		
		BankAccount temp1Account1=map.get(temp);
		System.out.println("Customer Account details:");
		System.out.print(temp1Account1.getAccountCus().getCustomerId()+ " ");
		System.out.print(temp1Account1.getAccountCus().getCustomerName()+ " ");
		System.out.println(temp1Account1.getAccountbal());
		
		BankAccount temp2Account2=map.get(temp);
		System.out.println("Customer Account details:");
		System.out.print(temp2Account2.getAccountCus().getCustomerId()+ " ");
		System.out.print(temp2Account2.getAccountCus().getCustomerName()+ " ");
		System.out.println(temp2Account2.getAccountbal());
		
		}

}
