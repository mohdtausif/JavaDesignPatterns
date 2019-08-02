package mohdtausif.demo.designpattern.singleton;

public class Main {
	public static void main(String[] args)
	{
		SingletonClass obj1 = SingletonClass.getInstance();
		obj1.setMessage("Hello JavaHive");
		System.out.println("Message Set in Obj1: "+obj1.getMessage());
		
		SingletonClass obj2 = SingletonClass.getInstance();
		System.out.println("Message Get from Obj2: "+obj2.getMessage());
	}
}
