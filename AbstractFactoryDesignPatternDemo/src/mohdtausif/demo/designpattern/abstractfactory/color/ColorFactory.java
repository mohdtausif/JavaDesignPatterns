package mohdtausif.demo.designpattern.abstractfactory.color;

import mohdtausif.demo.designpattern.abstractfactory.AbstractFactory;

public class ColorFactory extends AbstractFactory{
	
	@Override
	public Color getColor(ColorType colorType)
	{
		switch(colorType)
		{
			case RED:
			{
			  return new RedColor();	
			}
			case BLUE:
			{
			  return new BlueColor();	
			}
			case GREEN:
			{
			  return new GreenColor();	
			}
			default:
			{
				throw new RuntimeException("Undefined Color Exception");
			}
		}
	}
}
