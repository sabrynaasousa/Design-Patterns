public class Singleton{

  private static Singleton instance;

  private Singleton(){}

  public static Singleton getInstance(){
    if (instance == null){
      initializeInstance();
    }
    return instance;
  }

  public static synchronized void initializeInstance(){
    if (instance == null ){
      instance = new Singleton();
    }
  }
}
