package mohdtausif.demo.designpattern.singleton;

public class SingletonClass {
	
	String message;
	private static SingletonClass singletonClass=null;
	
	private SingletonClass() {}
	
	public static SingletonClass getInstance()
	{
		if(singletonClass==null)
		{
			synchronized (SingletonClass.class) {
				if(singletonClass==null)
				{
					singletonClass=new SingletonClass();	
				}
			}
		}
		return singletonClass;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
