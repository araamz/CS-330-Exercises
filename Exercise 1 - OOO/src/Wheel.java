public class Wheel {
    private double diameter;
    private boolean isDull;
    private String brand;

    public Wheel(){

        diameter = 0;
        isDull = false;
        brand = "DEFAULT BRAND";

    }

    //getters
    public boolean getIsDull() {
        return isDull;
    }
    public double getDiameter() {
        return diameter;
    }
    public String getBrand() {
        return brand;
    }

    //setters
    public void setDiameter(double diameter){
        this.diameter = diameter;
    }
    public void setDull(boolean dull){
        isDull = dull;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //methods
    public boolean replaceRubber(boolean newRubber){

        setDull(newRubber);

        if( getIsDull() == newRubber){
            return true;
        } else {
            return false;
        }
    }

}
