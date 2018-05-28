package mohdtausif.demo.designpattern.builder;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "VegBurger";
	}

	@Override
	public float price() {
		return 35;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+" ("+packing()+") = "+price();
	}
}
