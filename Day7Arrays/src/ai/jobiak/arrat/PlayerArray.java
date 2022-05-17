package ai.jobiak.arrat;

import java.util.*;

public class PlayerArray {

	public static void main(String[] args) {
		
		
		
		System.out.println(Math.PI);
		
		Scanner scanner=new Scanner(System.in);
		Player p1=new Player("Virat kohli",1);
		Player p2=new Player("Virat kohli",1);
		Player p3=new Player("Virat kohli",1);
		Player p4=new Player("Virat kohli",1);
		Player p5=new Player("Virat kohli",1);
		Player p6=new Player("Virat kohli",1);
		Player p7=new Player("Virat kohli",1);
		Player p8=new Player("Virat kohli",1);
		Player p9=new Player("Virat kohli",1);
		Player p10=new Player("Virat kohli",1);
		
		//int numbers[]=new int[2];//from 0-9 index
		//String names[]=new String[2];
		
		Player players[]=new Player[10];
		
		for(Player player:players) {
			System.out.println(player);
			//System.out.println("");
		}
		System.out.println("===============");
		
		players[0]=p2;
		players[1]=p1;
		players[2]=p6;
		players[3]=p3;
		players[4]=p9;
	    players[5]=p7;
	    players[6]=p4;
		players[7]=p10;
		players[8]=p8;
		players[9]=p5;
		
		for (Player player: players) {
			System.out.println(player);
			System.out.println(player.getRanking());
		}
		
		System.out.println("===============");
		for (Player player:players) {
			System.out.println(player);
		}
				
		
		
		
		
		
		
		

	}

	
	
}
