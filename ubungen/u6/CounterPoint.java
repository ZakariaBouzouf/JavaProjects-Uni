public class CounterPoint extends Point{
  static int count=0;

  public CounterPoint(int x, int y){
    super(x,y);
    count=count+1;
  }
  // public static int getCount() {
  //   return count;
  // }
  //
  // public static void setCount(int count) {
  //   CounterPoint.count = count;
  // }

}
