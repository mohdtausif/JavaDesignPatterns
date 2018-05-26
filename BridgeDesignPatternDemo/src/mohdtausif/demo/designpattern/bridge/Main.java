package mohdtausif.demo.designpattern.bridge;

public class Main {

	public static void main(String[] arg)
	{
		Triangle triangle=new Triangle(new RedColor());
		triangle.applyColor();
		
		Square square=new Square(new GreenColor());
		square.applyColor();
	}
}
