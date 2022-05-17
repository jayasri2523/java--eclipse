package ai.jobiak.maps;

import java.util.Objects;

public class BankAccount {
	
	private int accountno;
	private double accountbal;
	private Customer accountCus;
	public BankAccount(int accountno, double accountbal, Customer accountCus) {
		super();
		this.accountno = accountno;
		this.accountbal = accountbal;
		this.accountCus = accountCus;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public double getAccountbal() {
		return accountbal;
	}
	public void setAccountbal(double accountbal) {
		this.accountbal = accountbal;
	}
	public Customer getAccountCus() {
		return accountCus;
	}
	public void setAccountCus(Customer accountCus) {
		this.accountCus = accountCus;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountCus, accountbal, accountno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return Objects.equals(accountCus, other.accountCus)
				&& Double.doubleToLongBits(accountbal) == Double.doubleToLongBits(other.accountbal)
				&& accountno == other.accountno;
	}
	
	
	

}

