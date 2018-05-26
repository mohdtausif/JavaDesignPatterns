package mohdtausif.demo.designpattern.adapter;

public class AdapterDesignPatternUsingClassAdapter extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get40Volt() {
		return convert(getVolt(), 3);
	}

	@Override
	public Volt get3Volt() {
		return convert(getVolt(), 40);
	}

	private Volt convert(Volt v, int i)
	{
		return new Volt(v.getVolt()/i);
	}
}
