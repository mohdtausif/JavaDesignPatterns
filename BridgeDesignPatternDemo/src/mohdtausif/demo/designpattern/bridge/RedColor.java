package mohdtausif.demo.designpattern.bridge;

/**
 * RedColor class is a implementation of interface Color
 * @author tausif
 */
public class RedColor implements Color {
	@Override
	public void applyColor() {
		System.out.println("Red Color");
	}
}
