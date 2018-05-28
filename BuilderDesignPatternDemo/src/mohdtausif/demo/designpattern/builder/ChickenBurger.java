package mohdtausif.demo.designpattern.builder;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "ChickenBurger";
	}

	@Override
	public float price() {
		return 150;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName()+" ("+packing()+") = "+price();
	}
}
