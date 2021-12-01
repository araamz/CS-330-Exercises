public class Guitar implements GuitarController {

  public void PressFretButton(colors button) {

    if (button == colors.GREEN) {

      System.out.println("Guitar : Pressing Fret GREEN.");

    } else if (button == colors.RED) {

      System.out.println("Guitar : Pressing Fret RED.");

    } else if (button == colors.YELLOW) {

      System.out.println("Guitar : Pressing Fret YELLOW.");

    }  else if (button == colors.BLUE) {

      System.out.println("Guitar : Pressing Fret BLUE.");

    } else {

      System.out.println("Guitar : Pressing Fret ORANGE.");

    }

  }


  
  public void PressPick() {

    System.out.println("Guitar : Presing Pick.");

  }
  public void PressTremelo() {

    System.out.println("Guitar : Presing Tremelo.");
    
  } 

}