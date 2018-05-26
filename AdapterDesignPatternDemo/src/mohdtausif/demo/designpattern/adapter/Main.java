package mohdtausif.demo.designpattern.adapter;

public class Main {

	/**
	 * main method to test adapter pattern
	 * 
	 * @param arg
	 */
	public static void main(String[] arg) {
		testAdapterDesignPatternUsingObjectAdapterImpl();
		testAdapterDesignPatternUsingClassAdapter();
	}

	/**
	 * Adapter Pattern example using Object adapter
	 */
	public static void testAdapterDesignPatternUsingObjectAdapterImpl() {
		System.out.println("testAdapterDesignPatternUsingObjectAdapterImpl()=>");
		SocketAdapter adapter = new AdapterDesignPatternUsingObjectAdapterImpl();
		Volt v120 = getVolt(adapter, 120);
		Volt v40 = getVolt(adapter, 40);
		Volt v3 = getVolt(adapter, 3);
		System.out.println("v3 volts using Class Adapter=" + v3.getVolt());
		System.out.println("v12 volts using Class Adapter=" + v40.getVolt());
		System.out.println("v120 volts using Class Adapter=" + v120.getVolt());
	}

	/**
	 * Adapter Pattern example using class adapter
	 */
	public static void testAdapterDesignPatternUsingClassAdapter() {
		System.out.println("testAdapterDesignPatternUsingClassAdapter=>");
		SocketAdapter adapter = new AdapterDesignPatternUsingClassAdapter();
		Volt v120 = getVolt(adapter, 120);
		Volt v40 = getVolt(adapter, 40);
		Volt v3 = getVolt(adapter, 3);
		System.out.println("v3 volts using Object Adapter=" + v3.getVolt());
		System.out.println("v12 volts using Object Adapter=" + v40.getVolt());
		System.out.println("v120 volts using Object Adapter=" + v120.getVolt());
	}

	/**
	 * On the basis of requirement adapter converting the volt value to the specific
	 * value that is needed by any particular mobile phone
	 * 
	 * @param adapter
	 * @param i
	 * @return
	 */
	public static Volt getVolt(SocketAdapter adapter, int i) {
		if (i == 120) {
			return adapter.get120Volt();
		} else if (i == 40) {
			return adapter.get40Volt();
		} else if (i == 3) {
			return adapter.get3Volt();
		} else {
			return adapter.get120Volt();
		}
	}
}
