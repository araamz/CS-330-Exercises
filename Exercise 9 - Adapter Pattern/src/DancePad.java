public class DancePad implements DanceController { 

  public void Step(direction dir) {
    if (dir == direction.FORWARD) {
      System.out.print("Dance Pad : Stepping FORWARD.\n");
    }
    else if (dir == direction.LEFT) {
      System.out.print("Dance Pad : Stepping LEFT.\n");
    }
    else if (dir == direction.RIGHT) {
      System.out.print("Dance Pad : Stepping RIGHT.\n");
    }
    else if (dir == direction.BACK) {
      System.out.print("Dance Pad : Stepping BACK.\n");
    }
    else if (dir == direction.MIDDLE) {
      System.out.print("Dance Pad : Stepping MIDDLE.\n");
    }
  }
}