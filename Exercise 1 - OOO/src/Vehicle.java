public abstract class Vehicle {

    protected String color;
    protected String name;
    protected Wheel[] wheels;
    protected int wheelCount;

    public Vehicle (){

        color = "UNKNOWN COLOR";
        name = "UNKNOWN NAME";
        wheelCount = 0;

    }

    //getters
    public String getColor() {
        return color;
    }
    public String getName (){
        return name;
    }

    //setters
    public void setColor(String color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }

    //methods
    public abstract boolean replaceWheels(int newWheelCount);

}

