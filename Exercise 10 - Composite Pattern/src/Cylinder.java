public class Cylinder implements Prims{
       private double height;
    private double radius;


    public Cylinder (double h, double r){
        this.height = h;
        this.radius = r;
        
  
    }
    public double calcVolume(){
        double volume = (radius*radius)*(3.14)*(height);
        return volume;
    }
}