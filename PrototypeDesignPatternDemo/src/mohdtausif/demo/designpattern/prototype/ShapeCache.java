package mohdtausif.demo.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
	
	Map<String, Shape> cache;
	
	public ShapeCache()
	{
		cache=new HashMap<String, Shape>();
		loadCache();
	}
	
	public Shape getShape(Type type)
	{
		if(type==Type.CIRCLE)
		{
			return (Shape)cache.get(Type.CIRCLE.toString()).clone();
		}
		else if(type==Type.RECTANGLE)
		{
			return (Shape)cache.get(Type.RECTANGLE.toString()).clone();
		}
		else if(type==Type.SQUARE)
		{
			return (Shape)cache.get(Type.SQUARE.toString()).clone();
		}
		else
		{
			throw new RuntimeException("Unsupported Shape Type");
		}
	}
	
	public void loadCache()
	{
		cache.put(Type.CIRCLE.toString(), new Circle());
		cache.put(Type.SQUARE.toString(), new Square());
		cache.put(Type.RECTANGLE.toString(), new Rectangle());
	}
}
