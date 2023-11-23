public class Main {
    public static void main(String[] args) {
        CounterPoint counterPoint = new CounterPoint(0,0);
        Point point1 = new Point(0,4);
        Point point2 = new Point(1,4);
        ColorPoint point3 = new ColorPoint(0,4,30,0,0);
        ColorPoint point4 = new ColorPoint(0,4,30,2,0);
        ColorPoint2 point5 = new ColorPoint2(0,4,30,0,0);

        System.out.println(point3.hashCode());
        System.out.println(point4.hashCode());
        // System.out.println(point1);
        // System.out.println(point5);
        // if (point1.equals(point5)){
        //     System.out.println("Equal.");
        // }else System.out.println("Not equal.");
        // System.out.println(counterPoint.getCount());
    }
}
