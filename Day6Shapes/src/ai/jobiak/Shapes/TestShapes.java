package ai.jobiak.Shapes;

public abstract class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Shape sRef;
		sRef=new Cube2();
		sRef.area();
		System.out.println("Area of Rectangle is "+sRef.area());
		sRef=new Cone();
		sRef.area();
		System.out.println("Area of Cone is "+sRef.area());
		sRef=new Parallelogram4();
		sRef.area();
		System.out.println("Area of Parallelogram is "+sRef.area());
		
		sRef=new Square();
		sRef.area();
		System.out.println("Area of Square is "+sRef.area());
		sRef=new Triangle();
		sRef.area();
		System.out.println("Area of Triangle is "+sRef.area());
		sRef=new Rectangular();
		sRef.area();
		System.out.println("Area of Rectangular is "+sRef.area());
		sRef=new Rhombus5();
		sRef.area();
		System.out.println("Area of Rhombus5 is "+sRef.area());
		sRef=new Cuboid3();
		sRef.area();
		System.out.println("Area of Cuboid3 is "+sRef.area());
		
		
		
		
		
		

	}

}
