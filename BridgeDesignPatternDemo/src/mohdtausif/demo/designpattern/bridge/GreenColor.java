package mohdtausif.demo.designpattern.bridge;

/**
 * GreenColor class is a implementation of interface Color
 * @author tausif
 */
public class GreenColor implements Color {
	@Override
	public void applyColor() {
		System.out.println("Green Color");
	}
}
