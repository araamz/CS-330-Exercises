package Subjects;
import java.util.ArrayList;

import ObserversPCKG.*;

public class BabyData implements Subject{
	private ArrayList<Observer> observers;
	private boolean isCrying;
	private int soundLevel;
	private String babyName;
	
	
	private String name;
	
	public BabyData(String name, String BabyName){
		observers = new ArrayList<Observer>();
		this.name = name;
		isCrying = false;
		soundLevel = -1;
		babyName = BabyName;
		
	}

	@Override
	public void RegisterObserver(Observer O) {
		observers.add(O);
		
	}
	@Override
	public void RemoveObserver(Observer O) {
		observers.remove(O);
		
	}
	@Override
	public void notiftyObserver() {
		for(Observer o : observers) {
			o.update();
		}
		
	}
	public boolean isCrying() {
		return isCrying;
	}

	public int getSoundLevel() {
		return soundLevel;
	}

	public String getBabyName() {
		return babyName;
	}
	
	public String getName() {
		return name;
	}

	public void updateBabyData(boolean isCrying, int soundlevel) {
		this.isCrying = isCrying;
		this.soundLevel = soundlevel;
		notiftyObserver();
	}
	
	
	
	
	
}
