package mohdtausif.demo.designpattern.prototype;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName());
	}
	
}
