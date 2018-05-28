package mohdtausif.demo.designpattern.builder;

public class MealBuilder {
	public Meal prepareVageMeal(){
		Meal meal=new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Cock());
		return meal;
	}
	
	public Meal prepareNonVageMeal(){
		Meal meal=new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
