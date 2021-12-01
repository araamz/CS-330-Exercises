import java.lang.reflect.*;

public class AdultInvocationHandler implements InvocationHandler {
	
	IRemote remote;

	public AdultInvocationHandler(IRemote remote) {
		
		this.remote = remote;
		
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		try {
			
			if (method.getName().startsWith("channel") || method.getName().startsWith("volume") || method.getName().startsWith("get")) {

				return method.invoke(remote, args);
				
			} else {
				
				throw new IllegalAccessException();
				
			}
			
		} catch (InvocationTargetException error) {
			
			error.printStackTrace();
			
		}
		
		return null;
		
	}

}
