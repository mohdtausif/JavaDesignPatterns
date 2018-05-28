package mohdtausif.demo.designpattern.factory;

public class Main {
	public static void main(String[] args)
	{
		Shape shape1 = ShapeFactory.getShape(ShapeType.CIRCLE);
		System.out.println("Hey who are you? ");
		shape1.whoAmI();
		System.out.println("-------------------------------");
		
		Shape shape2 = ShapeFactory.getShape(ShapeType.SQUARE);
		System.out.println("Hey who are you? ");
		shape2.whoAmI();
		System.out.println("-------------------------------");
		
		Shape shape3 = ShapeFactory.getShape(ShapeType.RECTANGLE);
		System.out.println("Hey who are you? ");
		shape3.whoAmI();
	}
}
