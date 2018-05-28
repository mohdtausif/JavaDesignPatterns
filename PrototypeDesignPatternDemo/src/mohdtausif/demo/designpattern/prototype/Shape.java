package mohdtausif.demo.designpattern.prototype;

public abstract class Shape implements Cloneable {
	String id;
	Type type;
	
	public abstract void draw();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	public Object clone(){
		Object clone=null;
		try
		{
			clone=super.clone();
		}
		catch(CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
		return clone;
	}
}
