package ai.jobiak.oops;

public class VanillaIcecream {
	Icecream Chocolate;
	String brand;
	public VanillaIcecream() {
		
		
	}
	public VanillaIcecream(Icecream chocolate, String brand) {
		super();
		Chocolate = chocolate;
		this.brand = brand;
	}
	public Icecream getChocolate() {
		return Chocolate;
	}
	public void setChocolate(Icecream chocolate) {
		Chocolate = chocolate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "VanillaIcecream [Chocolate=" + Chocolate + ", brand=" + brand + "]";
	}
	

}
