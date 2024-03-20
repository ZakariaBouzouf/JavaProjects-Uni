public class Main {
  public static void main(String[] args) {
    CounterPoint counterPoint1 = new CounterPoint(0,0);
    CounterPoint counterPoint2 = new CounterPoint(0,0);
    CounterPoint counterPoint3 = new CounterPoint(0,0);
    Point point = new Point(3,0);
    Color black = new Color((byte)100,(byte)200,(byte)100);
    ColorPoint colorPoint = new ColorPoint(0,0,black);

    // System.out.println(CounterPoint.count);

    System.out.println(point.equals(colorPoint));
    System.out.println(colorPoint.equals(point));
  }
}
