package mohdtausif.demo.designpattern.abstractfactory.shape;

import mohdtausif.demo.designpattern.abstractfactory.AbstractFactory;

public class ShapeFactory extends AbstractFactory{
	
	@Override
	public Shape getShape(ShapeType shapeType)
	{
		switch(shapeType)
		{
			case CIRCLE:
			{
			  return new Circle();	
			}
			case SQUARE:
			{
			  return new Square();	
			}
			case RECTANGLE:
			{
			  return new Rectangle();	
			}
			default:
			{
				throw new RuntimeException("Undefined Shape Exception");
			}
		}
	}
}
