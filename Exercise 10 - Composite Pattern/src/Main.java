class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

  //Table is a parent of table_legs has a collection of legs(children)
  //Creating a table_legs object that contains it's own children(box prims)

  Objects table_legs = new Objects();
  Box table_leg_one = new Box(4,5,6);
  Box table_leg_two = new Box(4,5,6);
  Box table_leg_three = new Box(4,5,6);
  Box table_leg_four = new Box(4,5,6);

  table_legs.add(table_leg_four);
  table_legs.add(table_leg_three);
  table_legs.add(table_leg_two);
  table_legs.add(table_leg_one);

  Box table_surface = new Box(1,5,6);
  Sphere ball = new Sphere(6);
  
  //Creating the parent which is the table, and adding it direct child table_legs & then adding the surface table's other direct child
  Objects table = new Objects();
  table.add(table_legs);
  table.add(table_surface);
  table.add(ball);

  System.out.println("The Volume of table is " + table.calcVolume() + ".");

  
  

    
  }
}