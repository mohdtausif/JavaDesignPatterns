package mohdtausif.demo.designpattern.adapter;

public class Main {
	
	public static void main(String[] arg)
	{
		testAdapterDesignPatternUsingObjectAdapterImpl();
		testAdapterDesignPatternUsingClassAdapter();
	}
	
	public static void testAdapterDesignPatternUsingObjectAdapterImpl()
	{
		System.out.println("testAdapterDesignPatternUsingObjectAdapterImpl()=>");
		SocketAdapter adapter=new AdapterDesignPatternUsingObjectAdapterImpl();
		Volt v120=getVolt(adapter, 120);
		Volt v40=getVolt(adapter, 40);
		Volt v3=getVolt(adapter, 3);
		System.out.println("v3 volts using Class Adapter="+v3.getVolt());
		System.out.println("v12 volts using Class Adapter="+v40.getVolt());
		System.out.println("v120 volts using Class Adapter="+v120.getVolt());
	}
	
	public static void testAdapterDesignPatternUsingClassAdapter()
	{
		System.out.println("testAdapterDesignPatternUsingClassAdapter=>");
		SocketAdapter adapter=new AdapterDesignPatternUsingClassAdapter();
		Volt v120=getVolt(adapter, 120);
		Volt v40=getVolt(adapter, 40);
		Volt v3=getVolt(adapter, 3);
		System.out.println("v3 volts using Object Adapter="+v3.getVolt());
		System.out.println("v12 volts using Object Adapter="+v40.getVolt());
		System.out.println("v120 volts using Object Adapter="+v120.getVolt());
	}
	
	public static Volt getVolt(SocketAdapter adapter, int i)
	{
		if(i==120)
		{
			return adapter.get120Volt();
		}
		else if(i==40)
		{
			return adapter.get40Volt();
		}
		else if(i==3)
		{
			return adapter.get3Volt();
		}
		else
		{
			return adapter.get120Volt();
		}
	}
}
