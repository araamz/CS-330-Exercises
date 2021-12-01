/*
Team Members: Araam Zaremehrjardi & Rachel Burnett
Date: 10/26/2021
Assignment: Adapter Pattern
*/
class Main {
  public static void main(String[] args) {
    
    DancePad dance_pad = new DancePad();
    Guitar guitar = new Guitar();
    
    System.out.println("*** CONVERTING DIRECTION TO COLOR ***");
    DanceController directionToColor = new ControllerAdapter(guitar);
    directionToColor.Step(DanceController.direction.FORWARD);

    System.out.println("*** CONVERTING COLOR TO DIRECTION ***");
    GuitarController colorToDirection = new ControllerAdapter(dance_pad);
    colorToDirection.PressFretButton(GuitarController.colors.GREEN);

  }
}