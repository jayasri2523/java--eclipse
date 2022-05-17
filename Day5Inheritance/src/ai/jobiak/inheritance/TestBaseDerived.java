package ai.jobiak.inheritance;

public class TestBaseDerived {

	public static void main(String[] args) {
		
		new Derived();
		//new Derived();
		new Derived().m();
		
		System.out.println(Base.data);
		System.out.println(Derived.data=20);
		Derived.m();
		new Derived();
		new Derived().m();
		

	}

}
