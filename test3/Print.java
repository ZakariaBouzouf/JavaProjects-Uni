public class Print {
  private static Print instance;

  private Print(){};

  public static Print getInstance(){
    if (instance ==null){
    instance = new Print();
    }
    return instance;
  }
  public <T> void insert(T m) {
    System.out.println(m);
  }
  public <T> String add (T m, T n){
    var o = m.toString() +" "+ n.toString();
    return o;
  }
}
