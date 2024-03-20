import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

public class Mainn {
  public static void main(String[] args) {
    // List<Cell> cells1 = new ArrayList<>();
    // List<Cell> cells2 = new ArrayList<>();
    //
    // for (int i = 0; i < 20; i++) {
    //   Cell cell = new Cell(1);
    //   cells1.add(cell);
    // }
    // for (int i = 0; i < 20; i++) {
    //   Cell cell = new Cell(2);
    //   cells2.add(cell);
    // }
    Cell cell1 = new Cell(100);
    Cell cell2 = new Cell(200);

    new Thread(() -> {
      cell1.swapValue(cell2);
    }).start();
    System.out.println(cell1);
    System.out.println(cell2);
    new Thread(() -> {
      cell2.swapValue(cell1);
    }).start();

    System.out.println(cell1);
    System.out.println(cell2);
  }

  private static void acquireResourcesInOrder(Lock firstLock, Lock secondLock) {
    firstLock.lock();
    System.out.println(Thread.currentThread().getName() + " acquired " + firstLock);

    // Simulate some work
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    secondLock.lock();
    System.out.println(Thread.currentThread().getName() + " acquired " + secondLock);
  }

  private static void releaseResources(Lock firstLock, Lock secondLock) {
    secondLock.unlock();
    System.out.println(Thread.currentThread().getName() + " released " + secondLock);

    firstLock.unlock();
    System.out.println(Thread.currentThread().getName() + " released " + firstLock);
  }
}
