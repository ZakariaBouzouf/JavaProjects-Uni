import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
  public static int fibonacci_recu(int a) {
    if (a == 0)
      return 0;
    if (a == 1)
      return 1;
    else {
      return fibonacci_recu(a - 1) + fibonacci_recu(a - 2);
    }
  }

  public static int fibonacci_seq(int a) {
    int b = 0;
    int c = 1;
    int summe = 1;
    if (a == 0)
      return 0;
    if (a == 1)
      return 1;
    else {
      for (int i = 0; i < a; i++) {
        summe = c + b;
        c = b;
        b = summe;
      }
    }
    return summe;
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    long start = System.currentTimeMillis();
    int sum = 0;
    for (int i = 0; i <= 44; i++) {
      sum = sum + fibonacci_recu(i);
    }
    System.out.println("Normal : " + sum);
    long duration = System.currentTimeMillis() - start;
    System.out.println("Duration : " + duration);

    new Thread(() -> {
      long start2 = System.currentTimeMillis();
      int sum2 = 0;
      for (int i = 0; i < 44; i++) {
        sum2 = sum2 + fibonacci_recu(i);
      }
      System.out.println("Threads : " + sum2);
      long duration2 = System.currentTimeMillis() - start2;
      System.out.println("Duration : " + duration2);
    }).start();

    long start3 = System.currentTimeMillis();
    var exec = Executors.newCachedThreadPool();
    List<Future<Integer>> futures = new ArrayList<>();
    for (int i = 0; i < 44; i++) {
      final int j = i;
      Callable<Integer> cCalc = () -> {
        return (Integer) fibonacci_recu(j);
      };
      var future = exec.submit(cCalc);
      futures.add(future);
    }
    int sum3 = 0;
    for (var future : futures) {
      sum3 += future.get();
    }
    long duration3 = System.currentTimeMillis() - start3;
    System.out.println("Future feb : " + sum3);
    System.out.println("Duration : " + duration3);

  }
}
