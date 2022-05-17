package ai.jobiak.enums;

public class TestPlanet {

	public static void main(String[] args) {
		
		Planet MyPlanet = Planet.EARTH;
		canILiveHere(MyPlanet);
		
	}
	
	static void canILiveHere(Planet MyPlanet) {
		switch(MyPlanet) {
		case EARTH:
			System.out.println("You can Live Here");
			System.out.println("This is Planet #"+MyPlanet.number);
			
			break;
		default:
			System.out.println("You can't Live Here");
			System.out.println("This is Planet #"+MyPlanet.number);
			
			
			break;
			
			
		}
	}
	

}
