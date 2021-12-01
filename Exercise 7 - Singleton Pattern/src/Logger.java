public class Logger{
  private static Logger uniqueLogger = new Logger();
  private int loggedMessages;

  private Logger(){
    loggedMessages=0;
  }

  public static synchronized Logger getInstance(){
    if(uniqueLogger==null){
      uniqueLogger=new Logger();
    }

    return uniqueLogger;
  }

  public synchronized void log(String msg){
    loggedMessages++;
    System.out.println("LOG:" + loggedMessages + " " + msg);
  }

  public synchronized void severe(String msg) {

    loggedMessages++;
    System.out.println("SEVERE:" + loggedMessages + " " + msg);

  }

  public synchronized void warning(String msg) {

    loggedMessages++;
    System.out.println("WARNING:" + loggedMessages + " " + msg);

  }  

  public synchronized void info(String msg) {

    loggedMessages++;
    System.out.println("INFO:" + loggedMessages + " " + msg);

  } 


}