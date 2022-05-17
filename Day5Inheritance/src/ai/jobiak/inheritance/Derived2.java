package ai.jobiak.inheritance;

public class Derived2 extends Base2 {
	
	int data=20;
	public Derived2() {
		System.out.println(super.data);
		System.out.println(this.data);
		
	}
	
	void m() {
	
	// m();  
	super.m();	
	System.out.println("Derived2 m()");
	}
	
	

}

