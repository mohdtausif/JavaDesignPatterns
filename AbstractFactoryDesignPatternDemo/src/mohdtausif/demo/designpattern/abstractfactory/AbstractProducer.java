package mohdtausif.demo.designpattern.abstractfactory;

import mohdtausif.demo.designpattern.abstractfactory.color.ColorFactory;
import mohdtausif.demo.designpattern.abstractfactory.shape.ShapeFactory;

public class AbstractProducer 
{
	public static AbstractFactory getFactory(AbstractFactoryType abstractFactoryType) 
	{
		switch(abstractFactoryType)
		{
			case SHAPE:
			{
				return new ShapeFactory();
			}
			case COLOR:
			{
				return new ColorFactory();
			}
			default:
			{
				throw new RuntimeException("Undefined AbstractFactory Type.");
			}
		}
	}
}
