import ObserversPCKG.*;
import Subjects.*;
public class Main {

	public static void main(String[] args) {
		BabyData bb1 = new BabyData("Baby Monitor A", "Baby 1");
		BabyData bb2 = new BabyData("Baby Monitor B", "Baby 2");
		AdvancedMonitor AM = new AdvancedMonitor(bb1, "Advanced Monitor");
		SimpleMonitor SM = new SimpleMonitor(bb1, "Simple Monitor");
		
		bb1.updateBabyData(true, 2);
		bb1.updateBabyData(true, 1);
		SM.loseInterest();
		bb1.updateBabyData(false, -1);
		AM.addBaby(bb2);
		bb2.updateBabyData(true, 0);
		
	}

}
