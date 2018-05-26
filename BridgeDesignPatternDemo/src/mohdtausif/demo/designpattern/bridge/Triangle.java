package mohdtausif.demo.designpattern.bridge;
/**
 * Triangle is a implementation of abtract class shape.
 */
public class Triangle extends Shape {
	public Triangle(Color color) {
		super(color);
	}
	@Override
	public void applyColor() {
		System.out.println("Triangle filled with color : ");
		color.applyColor();
	}
}
