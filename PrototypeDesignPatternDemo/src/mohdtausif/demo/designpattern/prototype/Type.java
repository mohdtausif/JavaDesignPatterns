package mohdtausif.demo.designpattern.prototype;

public enum Type {
	CIRCLE("CIRCLE"), SQUARE("SQUARE"), RECTANGLE("RECTANGLE");
	String val;
	private Type(String val)
	{
		this.val=val;
	}
	@Override
	public String toString() {
		return val;
	}
}
