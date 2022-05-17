package ai.jobiak.choclatecode;

public class Choclate {
	
	String description;
	double weight;
	double price;
	String packing;
	boolean sugarfree;
	
	public Choclate() {
		
		
		
		

}

	public Choclate(String description, double weight, double price, String packing, boolean sugarfree) {
		super();
		this.description = description;
		this.weight = weight;
		this.price = price;
		this.packing = packing;
		this.sugarfree = sugarfree;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPacking() {
		return packing;
	}

	public void setPacking(String packing) {
		this.packing = packing;
	}

	public boolean isSugarfree() {
		return sugarfree;
	}

	public void setSugarfree(boolean sugarfree) {
		this.sugarfree = sugarfree;
	}

	@Override
	public String toString() {
		return "Choclate [description=" + description + ", weight=" + weight + ", price=" + price + ", packing="
				+ packing + ", sugarfree=" + sugarfree + "]";
	}
	
	
	
	
	
}
