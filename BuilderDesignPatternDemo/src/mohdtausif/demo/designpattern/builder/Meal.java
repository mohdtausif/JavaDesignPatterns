package mohdtausif.demo.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal 
{
	List<Item> items=new ArrayList<Item>();
	public void addItem(Item item) {
		items.add(item);
	}
	public float getCost() {
		float cost=0f;
		for(Item item : items)
		{
			cost+=item.price();
		}
		return cost;
	}
	public void showItems() {
		for(Item item : items)
		{
			System.out.println(item);
		}
	}
}
