package ai.jobiak.enums;

public class CardsValues {

	public static void main(String[] args) {
		
		for(Cards elements:Cards.values()) {
			System.out.println(elements+","+"numberofcards are"+elements.showcards()+","+"index="+elements.ordinal());
		}
		
		
	}

}
