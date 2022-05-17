package ai.jobiak.Threads;

public class TryCatch extends Thread{
	
	String name;

	public TryCatch(String name) {
		
		this.name = name;
	}
	
	public void run() {
		for(int i=1;i<500;i++)
		System.out.println(this.name+"/entered run()-"+i);
		
		//System.out.println(this.currentThread.getName+"entered run()");
		
	
		
		
		
		
		
		try {
			sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
		



	