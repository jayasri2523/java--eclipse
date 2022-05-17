package ai.jobiak.Shapes;

public class Cuboid3 extends Shape {
	double length=10;
	double width=7;
	double height=12;


	@Override
	public double area() {
		// TODO Auto-generated method stub
		
		return 2*(length*width)+2*(length*height)+2*(height*width);
		
	}

}
