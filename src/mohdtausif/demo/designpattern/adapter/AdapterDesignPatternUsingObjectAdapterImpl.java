package mohdtausif.demo.designpattern.adapter;

public class AdapterDesignPatternUsingObjectAdapterImpl implements SocketAdapter{

	Socket socket=new Socket();
	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get40Volt() {
		return convert(socket.getVolt(), 3);
	}

	@Override
	public Volt get3Volt() {
		return convert(socket.getVolt(), 40);
	}
	
	private Volt convert(Volt v, int i)
	{
		return new Volt(v.getVolt()/i);
	}

}
