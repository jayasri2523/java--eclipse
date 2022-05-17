package ai.jobiak.day10;

public class MultItHREADING {

	public static void main(String[] args) {
		
		System.out.println("started main......");
		
		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		
		//t1.run();//
		//t2.run();
		t1.start();
		t2.start();
		
	}

}
