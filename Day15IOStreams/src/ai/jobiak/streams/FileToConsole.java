package ai.jobiak.streams;
import java.io.*;

public class FileToConsole {

	public static void main(String[] args) throws IOException {
		
		//byte streams
		FileInputStream fis=new FileInputStream("C:\\jobiak\\core\\IOStreamsDay15\\src\\ai\\jobiak\\streams\\FileToConsole.java");
			
			int data=fis.read();
		    while(data !=-1) {
		    System.out.println((char)data);
		    data=fis.read();
		    }
		    //
		

	}

}
