package ai.jobiak.maps;
import java.util.*;
import java.util.*;

public class TestTreeMap {

	public static void main(String[] args) {
		TreeMap players=new TreeMap();
		players.put(1, null);
		players.put(1, "Virat");
		players.put(3, "Burma");
		players.put(2, "Raina");
		players.put(4, "Dhoni");
		
		String name=(String) players.put(1, "Rohit");
		System.out.println(name);
		System.out.println(players);
		
		

	}

}
