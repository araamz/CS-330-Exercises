public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setColor("Black");
        car1.setName("Sam");
        car1.setModelYear(2020);
        car1.setTopSpeed(155);
        car1.repaint("Blue");
        car1.start();
        Bicycle bicycle1 = new Bicycle();
        bicycle1.setName("Bikey");
        bicycle1.setColor("Red");
        bicycle1.setBikeType("Mountain Bike");
        bicycle1.setHasHandleBarsSensitivity(true);
        bicycle1.pedal();

        Vehicle vehicle1 = car1;
        System.out.println("Getting color of vehicle (Car - car1) via variable (vehicle1): " + vehicle1.getColor());
        System.out.println("Getting name of vehicle (Car - car1) via variable (vehicle1): " + vehicle1.getName());
        vehicle1.replaceWheels(4);
        vehicle1 = bicycle1;

        System.out.println("Getting color of vehicle (Bicycle - bicycle 1) via variable (vehicle1): " + vehicle1.getColor());
        System.out.println("Getting name of vehicle (Bicycle - bicycle 1) via variable (vehicle1): " + vehicle1.getName());
        vehicle1.replaceWheels(3);

    }

}
