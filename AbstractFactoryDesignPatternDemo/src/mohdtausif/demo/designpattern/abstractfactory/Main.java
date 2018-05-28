package mohdtausif.demo.designpattern.abstractfactory;

import mohdtausif.demo.designpattern.abstractfactory.color.ColorType;
import mohdtausif.demo.designpattern.abstractfactory.shape.ShapeType;

public class Main {
	public static void main(String[] args)
	{
		AbstractFactory shapeFactory = AbstractProducer.getFactory(AbstractFactoryType.SHAPE);
		
		System.out.println("---------------- SHAPE FACTORY---------------");
		System.out.println("Hey who are you? ");
		shapeFactory.getShape(ShapeType.CIRCLE).whoAmI();
		
		System.out.println("-------------------------------");
		
		System.out.println("Hey who are you? ");
		shapeFactory.getShape(ShapeType.RECTANGLE).whoAmI();
		
		System.out.println("-------------------------------");
		
		System.out.println("Hey who are you? ");
		shapeFactory.getShape(ShapeType.SQUARE).whoAmI();
		
		System.out.println("----------------COLOR FACTORY---------------");
		AbstractFactory colorFactory = AbstractProducer.getFactory(AbstractFactoryType.COLOR);
		
		System.out.println("Hey who are you? ");
		colorFactory.getColor(ColorType.BLUE).whoAmI();
		
		System.out.println("-------------------------------");
		
		System.out.println("Hey who are you? ");
		colorFactory.getColor(ColorType.GREEN).whoAmI();
		
		System.out.println("-------------------------------");
		
		System.out.println("Hey who are you? ");
		colorFactory.getColor(ColorType.RED).whoAmI();
	}
}
