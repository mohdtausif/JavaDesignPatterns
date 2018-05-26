package mohdtausif.demo.designpattern.bridge;

/**
 * abstract class shape to provide contract for behaviors of all shapes.
 * @author tausif
 *
 */
public abstract class Shape {
	Color color;
	public Shape(Color color)
	{
		this.color=color;
	}
	
	public abstract void applyColor();
}
