/* 
  *** COLORS TO DIRECTION MAPPING ***
  GREEN = FORWARD
  RED = LEFT
  YELLOW = RIGHT
  BLUE = BACK
  ORANGE = MIDDLE
*/
public class ControllerAdapter implements GuitarController, DanceController {
  
  private DancePad dance_pad;
  private Guitar guitar;

  public ControllerAdapter(DancePad controller) {
    this.dance_pad = controller;
  }
  
  public ControllerAdapter(Guitar controller) {

    this.guitar = controller;

  }

  public void PressFretButton(colors button) {

    if (button == colors.GREEN) {
      
      dance_pad.Step(direction.FORWARD);

    } else if (button == colors.RED) {

      dance_pad.Step(direction.LEFT);
      
    } else if (button == colors.YELLOW) {
      
      dance_pad.Step(direction.RIGHT);

    } else if (button == colors.BLUE) {

      dance_pad.Step(direction.BACK);

    } else {

      dance_pad.Step(direction.MIDDLE);

    }
    
  }

  public void PressPick() {

    dance_pad.Step(direction.MIDDLE);

  }
  public void PressTremelo() {

    dance_pad.Step(direction.FORWARD);  
    dance_pad.Step(direction.BACK);

  } 

  public void Step(direction dir) {
    
    if (dir == direction.FORWARD) {
     guitar.PressFretButton(colors.GREEN);
     guitar.PressPick();
    }
    else if (dir == direction.LEFT) {
     guitar.PressFretButton(colors.RED);
     guitar.PressPick();
    }
    else if (dir == direction.RIGHT) {
     guitar.PressFretButton(colors.YELLOW);
     guitar.PressPick();
    }
    else if (dir == direction.BACK) {
     guitar.PressFretButton(colors.BLUE);
     guitar.PressPick();
    }
    else if (dir == direction.MIDDLE) {
     guitar.PressFretButton(colors.ORANGE);
     guitar.PressPick();
    } 
  }

}