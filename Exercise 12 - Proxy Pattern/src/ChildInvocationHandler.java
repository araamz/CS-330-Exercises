import java.lang.reflect.*;

public class ChildInvocationHandler implements InvocationHandler {
	
	private IRemote remote;
	
	public ChildInvocationHandler(IRemote remote) {
		
		this.remote = remote;
		
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		try {
			
			if (method.getName().startsWith("volume") || method.getName().startsWith("get")) {
				
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
