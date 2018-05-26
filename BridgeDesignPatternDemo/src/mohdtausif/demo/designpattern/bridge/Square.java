package mohdtausif.demo.designpattern.bridge;

/**
 * Square is a implementation of abtract class shape.
 */
public class Square  extends Shape {
	public Square(Color color) {
		super(color);
	}
	@Override
	public void applyColor() {
		System.out.println("Square filled with color : ");
		color.applyColor();
	}
}
