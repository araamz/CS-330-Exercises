package ObserversPCKG;

import Subjects.*;

public class SimpleMonitor implements Observer{
	protected boolean isCrying;
	protected Subject monitor;
	protected String name;
	
	public SimpleMonitor(Subject o, String name) {
		this.monitor = o;
		monitor.RegisterObserver(this);
		this.name = name;
	}
	public void update() {
		this.isCrying = ((BabyData) monitor).isCrying();
		System.out.println(name + " : Baby" + (this.isCrying ? " is Crying" : " isn't Crying"));
	}
	
	public void loseInterest() {
		monitor.RemoveObserver(this);
		System.out.println(name + " has been removed as an observer of " + monitor.getName());
	}
}
