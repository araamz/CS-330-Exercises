public class Sphere implements Prims{
    private double radius;
    


    public Sphere(double r){
        this.radius = r;
  
    }
    public double calcVolume(){
        double volume = (1.33)*(3.14)*(radius*radius*radius);
        
        return volume;
    }
}