package ai.jobiak.oops;

public class Icecream {
	
	String name;
	double price;
	String rating;
	boolean sugarFree;
	
	public Icecream() {
		
	}

	public Icecream(String name, double price, String rating, boolean sugarFree) {
		super();
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.sugarFree = sugarFree;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public boolean isSugarFree() {
		return sugarFree;
	}

	public void setSugarFree(boolean sugarFree) {
		this.sugarFree = sugarFree;
	}

	@Override
	public String toString() {
		return "Icecream [name=" + name + ", price=" + price + ", rating=" + rating + ", sugarFree=" + sugarFree + "]";
	}
	

}
