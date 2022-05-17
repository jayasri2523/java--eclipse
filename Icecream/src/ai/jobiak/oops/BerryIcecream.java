package ai.jobiak.oops;

public class BerryIcecream {
	
	Icecream Berry;
	String brand;
	
	public BerryIcecream() {
	}

	public BerryIcecream(Icecream berry, String brand) {
		super();
		Berry = berry;
		this.brand = brand;
	}

	public Icecream getBerry() {
		return Berry;
	}

	public void setBerry(Icecream berry) {
		Berry = berry;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "BerryIcecream [Berry=" + Berry + ", brand=" + brand + "]";
	}
	
	
	
	

}
