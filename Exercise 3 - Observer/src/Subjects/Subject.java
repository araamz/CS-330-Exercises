package Subjects;
import ObserversPCKG.*;

public interface Subject {
	public void RegisterObserver(Observer O);
	public void RemoveObserver(Observer O);
	public void notiftyObserver();
	public String getName();
}
