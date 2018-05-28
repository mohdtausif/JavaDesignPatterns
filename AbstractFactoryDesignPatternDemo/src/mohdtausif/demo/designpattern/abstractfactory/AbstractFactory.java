package mohdtausif.demo.designpattern.abstractfactory;

import mohdtausif.demo.designpattern.abstractfactory.color.Color;
import mohdtausif.demo.designpattern.abstractfactory.color.ColorType;
import mohdtausif.demo.designpattern.abstractfactory.shape.Shape;
import mohdtausif.demo.designpattern.abstractfactory.shape.ShapeType;

public abstract class AbstractFactory {
	public Shape getShape(ShapeType shapeType) {return null;}
	public Color getColor(ColorType colorType) {return null;};
}
