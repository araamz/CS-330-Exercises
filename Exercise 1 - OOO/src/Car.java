public class Car extends Vehicle {

    private int modelYear;
    private double topSpeed;

    public Car (){

        super();
        wheelCount = 4;
        modelYear = 0;
        topSpeed = 0;
        wheels = new Wheel[wheelCount];

        for (int i = 0; i < wheelCount; i++) {

            wheels[i] = new Wheel();

        }

    }

    //getters
    public double getTopSpeed() {
        return topSpeed;
    }
    public int getModelYear() {
        return modelYear;
    }

    //setters
    public void setTopSpeed(double speed) {
        topSpeed = speed;
    }
    public void setModelYear(int year) {
        modelYear = year;
    }

    //methods
    public boolean start() {
        System.out.println("Starting Car! Vroom!");
        return true;
    }
    public boolean repaint(String newColor) {

        System.out.println("Get the bucket of Car Paint! Repainting the Car.");

        setColor(newColor);

        if (getColor() == newColor) {
            System.out.println("The car has been repainted.");
            return true;
        } else {
            System.out.println("The car has not been repainted.");
            return false;
        }

    }

    public boolean replaceWheels(int newWheelCount){

        System.out.println("Getting Car Tires and Car Jack. Replacing Car Wheels!");

        if (wheelCount != newWheelCount) {
            System.out.println("Can't replace wheels of Car.");
            return false;
        }

        for(int i = 0; i < newWheelCount; i++) {

            System.out.println("Replacing Car Wheel " + (i + 1) + ".");
            wheels[i] = new Wheel();

        }

        return true;

    }

}

