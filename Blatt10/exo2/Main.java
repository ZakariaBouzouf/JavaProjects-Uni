import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

public class Main {
  public static void main(String[] args) {
    Cell cell1 = new Cell(0);
    // for (int i = 0; i < 10; i++) {
    // System.out.println(cell1);
    // long val = cell1.getValue();
    // cell1.setValue(val + 1);
    // }
    // for (int i = 0; i < 10; i++) {
    // System.out.println(cell1);
    // long val = cell1.getValue();
    // cell1.setValue(val - 1);
    // }

    for (int i = 0; i < 10; i++) {
      new Thread(() -> {
        long val = cell1.getValue();
        System.out.println("Val Thread 1 : " + val);
        cell1.setValue(val + 1);
        System.out.println("Cell Thread 1 : " + cell1);
        System.out.println("New Val Thread 1 : " + val);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }).start();
    }

    for (int i = 0; i < 10; i++) {
      new Thread(() -> {
        System.out.println("Cell Thread 2 : " + cell1);
        long val = cell1.getValue();
        cell1.setValue(val - 1);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }).start();
    }
  }
}
