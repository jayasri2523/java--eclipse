package ai.jobiak.arrat;

public class Player {
	
	String playerName;
	int ranking;

	public Player() {
		// TODO Auto-generated method stub
	}
	
	public Player(String playerName, int ranking) {
		super();
		this.playerName = playerName;
		this.ranking = ranking;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", ranking=" + ranking + "]";
	}
	

}
