package mohdtausif.demo.designpattern.builder;

public class Main {

	public static void main(String[] args) {
		MealBuilder mealBuilder=new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVageMeal();
		Meal nonVegMeal = mealBuilder.prepareNonVageMeal();
		
		vegMeal.showItems();
		nonVegMeal.showItems();
	}

}
 