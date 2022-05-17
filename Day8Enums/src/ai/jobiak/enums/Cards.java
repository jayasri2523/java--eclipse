package ai.jobiak.enums;

public enum Cards {
	
	Diamond(13),Heart(13),Club(13),Spade(13);
	
	int numberofcards;
	Cards(int numberofcards) {
		this.numberofcards = numberofcards;
		
		
		
	}
	int showcards() {
		return this.numberofcards;
	}
	
		
	}

