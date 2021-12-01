class Main {
  public static void main(String[] args) {
    System.out.println("Testing Logger");

    // Test one = new Test(1);
    // Test two = new Test(2);
    // one.start();
    // two.start();

    Logger test = Logger.getInstance();

    test.log("test 1");
    test.log("test 2");

    test.severe("test 3");
    test.info("test 4");
    test.warning("test 5");


  }

  //Cannot subclass logger unless superclass has not already been created
}