package mohdtausif.demo.designpattern.builder;

public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 55;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+" ("+packing()+") = "+price();
	}
}
