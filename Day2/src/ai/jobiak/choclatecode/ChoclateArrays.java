package ai.jobiak.choclatecode;

import java.util.Arrays;

public class ChoclateArrays {
	
	private Choclate choclates[]=new Choclate[10];
	
	

	public ChoclateArrays(Choclate[] choclates) {
		super();
		this.choclates = choclates;
	}

	public Choclate[] getChoclates() {
		return choclates;
	}

	public void setChoclates(Choclate[] choclates) {
		this.choclates = choclates;
	}

	@Override
	public String toString() {
		return "ChoclateArrays [choclates=" + Arrays.toString(choclates) + "]";
	}
	
	
	

}
