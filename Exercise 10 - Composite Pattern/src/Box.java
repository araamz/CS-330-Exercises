public class Box implements Prims {
    private double height;
    private double width;
    private double length;


    public Box(double h, double w, double l){
        this.height = h;
        this.width = w;
        this.length = l;
  
    }

    public double calcVolume() {
        double volume = length * width* height;

        return volume;
    }
}