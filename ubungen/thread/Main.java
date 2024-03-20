import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    int maxList = 10;
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      new Thread(() -> {
        System.out.println("Thread producer started." + Thread.currentThread());
        while (true) {
          synchronized (list) {
            while (list.size() == maxList) {
              try {
                list.wait();
                Thread.sleep(1000);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
            list.add(1);
            list.notifyAll();
            System.out.println("List : "+list);
            System.out.println("Thread producer done." + Thread.currentThread());
          }
        }
      }).start();
    }

    for (int i = 0; i<5; i++) {
      new Thread(() -> {
        System.out.println("Thread consumer started." + Thread.currentThread());
        while (true) {
          synchronized (list) {
            while (list.size() == 0) {
              try {
                list.wait();
                Thread.sleep(1000);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
            list.remove(0);
            list.notifyAll();
            System.out.println("List : "+list);
            System.out.println("Thread consumer done." + Thread.currentThread());
          }
        }
      }).start();
    }
  }
}
