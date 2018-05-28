package mohdtausif.demo.designpattern.prototype;

public class Main {
public static void main(String[] args)
{
	ShapeCache shapeCache=new ShapeCache();
	
	Shape shape1 = shapeCache.getShape(Type.RECTANGLE);
	shape1.draw();
	
	Shape shape2 = shapeCache.getShape(Type.SQUARE);
	shape2.draw();

	Shape shape3 = shapeCache.getShape(Type.CIRCLE);
	shape3.draw();
}
}
