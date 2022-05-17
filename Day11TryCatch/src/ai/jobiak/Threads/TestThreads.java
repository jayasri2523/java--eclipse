package ai.jobiak.Threads;

import java.util.Scanner;

public class TestThreads {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner=new Scanner(System.in);
		TryCatch t1 = new TryCatch("t1");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		TryCatch t2 = new TryCatch("t2");
		System.out.println("Standard threads");
	
		 System.out.println(Thread.currentThread().getId());
		 System.out.println(Thread.currentThread().getName());
		 System.out.println(Thread.currentThread().isAlive());
		 System.out.println(Thread.currentThread().getPriority());
		 System.out.println(Thread.currentThread().isDaemon());
		 System.out.println(Thread.currentThread());
		 

		 
	}

}
