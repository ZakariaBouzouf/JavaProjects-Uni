import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    CounterPoint counterPoint = new CounterPoint(0, 0);
    Point point1 = new Point(0, 4);
    Point point2 = new Point(1, 4);
    ColorPoint point3 = new ColorPoint(0, 4, 30, 0, 0);
    ColorPoint point4 = new ColorPoint(0, 4, 30, 2, 0);
    ColorPoint2 point5 = new ColorPoint2(0, 4, 30, 0, 0);

    // points.add(point1);
    // points.add(point2);
    // points.add(point3);
    // points.add(point4);
    // points.add(counterPoint);

    try (var fos = new FileOutputStream("point.bat");
        var oos = new ObjectOutputStream(fos)) {
      oos.writeObject(point1);
      oos.writeObject(point2);
      // oos.writeObject(point3);
      // oos.writeObject(point4);
      // oos.writeObject(point5);
      oos.flush();
      System.out.println("Done.");
    } catch (IOException e) {
      e.printStackTrace();
    }
    try (var fis = new FileInputStream("point.bat");
        var ois = new ObjectInputStream(fis)) {

      List<Point> points = new ArrayList<>();

      System.out.println("Points are : " + points);

      while (true) {
        Object object = ois.readObject();
        if (object == null) {
          break;
        }
        if(object instanceof Point){
          Point point = (Point) object;
          points.add(point);
        }
      }
      System.out.println("Points are : " + points);
      }catch(EOFException e){
      e.printStackTrace();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    // System.out.println(point1.hashCode());
    // System.out.println(point4.hashCode());

    // Point pointCopy1 = new Point(point1);
    // Point pointCopy1 = point1.clone();

    // System.out.println(pointCopy1);
    // System.out.println(point1.hashCode());
    // System.out.println(point1);
    // System.out.println(pointCopy1.hashCode());

    // System.out.println(point1);
    // System.out.println(point5);
    // if (point1.equals(point5)){
    // System.out.println("Equal.");
    // }else System.out.println("Not equal.");
    // System.out.println(counterPoint.getCount());
  }
}
