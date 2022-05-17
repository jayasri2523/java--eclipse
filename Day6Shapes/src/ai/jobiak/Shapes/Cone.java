package ai.jobiak.Shapes;

public class Cone extends Shape {
	double length=9.3;
	double radius=8.5;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (Math.PI*radius*radius)+(Math.PI*radius*length);
	}

}
