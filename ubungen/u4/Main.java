import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<Double> list = new ArrayList<Double>();
    Scanner scanner = new Scanner(System.in);
    boolean shouldExitLoop = true;
    while (shouldExitLoop) {
      String input = scanner.next();
      switch (input) {
        case "show":
          for (Double value : list) {
            System.out.println(value);
          }
          break;
        case "sum":
          Double sum = 0.0;
          for (Double value : list) {
            sum = sum + value;
          }
          System.out.println("The summe is : " + sum);
          list.clear();
          break;
        case "product":
        Double pro = 0.0;
        for (Double value : list) {
          pro = pro * value;
        }
        System.out.println("The product of all the values is : " + pro);
        list.clear();
          break;
        case "quit":
          shouldExitLoop = false;
          break;
        default:
          list.add((Double.valueOf(input)));

      }

    }
  }
}
