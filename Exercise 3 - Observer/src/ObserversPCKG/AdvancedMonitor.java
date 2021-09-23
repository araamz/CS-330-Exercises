package ObserversPCKG;
import java.util.ArrayList;

import Subjects.*;


public class AdvancedMonitor implements Observer{
	private int soundLevels;
	private boolean isCrying;
	private ArrayList<Subject> Babies;
	private String name;
	
	public AdvancedMonitor(Subject o, String name) {
		Babies = new ArrayList<Subject>();
		
		this.Babies.add(o);
		Babies.get(0).RegisterObserver(this);
		this.name = name;
	}
	
	public void update() {
		for(int i = 0; i < Babies.size(); i++) {
			this.isCrying = ((BabyData) Babies.get(i)).isCrying();
			if(isCrying) {
				this.soundLevels = ((BabyData) Babies.get(i)).getSoundLevel();
			}
			System.out.println(name + " : " + ((BabyData) Babies.get(i)).getBabyName() + (this.isCrying ? (this.soundLevels == 0 ? " is Sobbing" : (this.soundLevels == 1 ? " is Crying" : " is Screaming")) : " isn't Crying"));
		}
	}
	
	public void loseInterest(int i) {
		System.out.println(name + " has been removed as an observer of " + ((BabyData) Babies.get(i)).getName());
		Babies.get(i).RemoveObserver(this);
	}
	
	public void addBaby(Subject o) {
		o.RegisterObserver(this);
		Babies.add(o);
		System.out.println("Added Monitor " + Babies.get(Babies.size()-1).getName());
	}
	
}
