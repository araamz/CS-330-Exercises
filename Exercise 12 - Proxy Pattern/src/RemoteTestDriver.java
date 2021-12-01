import java.lang.reflect.*;

public class RemoteTestDriver {
	
	public static void main(String[] args) { 
		RemoteTestDriver test = new RemoteTestDriver(); 
		test.drive();
	}
	
	public void drive() {
		
		IRemote living_room_remote = new Remote();
		
		IRemote remote_adultProxy = getAdultProxy(living_room_remote);
		System.out.println("Remote is on channel " + remote_adultProxy.get_channel() + " with volume at " + remote_adultProxy.get_volume());
		remote_adultProxy.channel_up();
		remote_adultProxy.volume_up();
		remote_adultProxy.channel_up();
		remote_adultProxy.channel_down();
		remote_adultProxy.volume_up();
		remote_adultProxy.volume_up();
		remote_adultProxy.volume_down();
		System.out.println("Remote is on channel " + remote_adultProxy.get_channel() + " with volume at " + remote_adultProxy.get_volume());
		
		IRemote remote_childProxy = getChildProxy(living_room_remote);
		System.out.println("Remote is on channel " + remote_childProxy.get_channel() + " with volume at " + remote_childProxy.get_volume());
		living_room_remote.volume_down();
		living_room_remote.volume_up();
		living_room_remote.volume_up();
		living_room_remote.volume_up();
		System.out.println("Remote is on channel " + remote_childProxy.get_channel() + " with volume at " + remote_childProxy.get_volume());
		remote_childProxy.channel_down();
		
	}
	
	public IRemote getChildProxy(IRemote remote) {
		
		return (IRemote) Proxy.newProxyInstance(
		
				remote.getClass().getClassLoader(), 
				remote.getClass().getInterfaces(), 
				new ChildInvocationHandler(remote));
		
	}
	
	public IRemote getAdultProxy(IRemote remote) {

		return (IRemote) Proxy.newProxyInstance(
				
				remote.getClass().getClassLoader(), 
				remote.getClass().getInterfaces(), 
				new AdultInvocationHandler(remote));
		
	}
	
}
