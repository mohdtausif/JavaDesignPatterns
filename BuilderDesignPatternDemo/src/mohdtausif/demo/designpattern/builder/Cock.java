package mohdtausif.demo.designpattern.builder;

public class Cock extends ColdDrink {

	@Override
	public String name() {
		return "Cock";
	}

	@Override
	public float price() {
		return 60;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+" ("+packing()+") = "+price();
	}
}
