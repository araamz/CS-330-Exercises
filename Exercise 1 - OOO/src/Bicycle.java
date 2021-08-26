public class Bicycle extends Vehicle {

    private boolean hasHandleBarsSensitivity;
    private String bikeType;

     public Bicycle(){

        super();
        wheelCount = 2;
        hasHandleBarsSensitivity = true;
        bikeType = "DEFAULT BIKE TYPE";
        wheels = new Wheel[2];

         for (int i = 0; i < wheelCount; i++) {

             wheels[i] = new Wheel();

         }

     }

    //getters
    public String getBikeType() {
        return bikeType;
    }
    public boolean getHasHandleBarsSensitivity() {
        return hasHandleBarsSensitivity;
    }

    //setters
    public void setBikeType(String type) {
        bikeType = type;
    }
    public void setHasHandleBarsSensitivity(boolean hasHandleBarsSensitivity) {
        this.hasHandleBarsSensitivity = hasHandleBarsSensitivity;
    }

    //methods
    public boolean pedal (){
         System.out.println("Bicycle! Bicycle! The Bicycle is being pedaled!");
        return true;
    }

    public boolean replaceWheels(int newWheelCount){

        System.out.println("Getting Wrenches and Screws! Replacing Bicycle Wheels!");

        if (wheelCount != newWheelCount) {
            System.out.println("Can't replace wheels of Bicycle.");
            return false;
        }

        for(int i = 0; i < newWheelCount; i++) {

            System.out.println("Replacing Bike Wheel " + (i + 1) + ".");
            wheels[i] = new Wheel();

        }

        return true;

    }

}
