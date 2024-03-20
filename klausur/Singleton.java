public class Singleton {
  private int a=10;
  private static Singleton instance;

  public int geta(){
    return a;
  }
  
  public static Singleton getInstance(){
    if (instance == null){
      instance = new Singleton();
    }
    return instance;
  }
}
