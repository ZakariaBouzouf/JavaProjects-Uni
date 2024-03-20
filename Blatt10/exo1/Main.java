import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numProducer = 15;
        int numConsumer = 15;
        ParkPlatz parkPlatz = new ParkPlatz();
        int maxList = parkPlatz.getMaxList();
        List<Car> cars = parkPlatz.getCars();
        // System.out.println(car1);
        for (int i = 0; i < numProducer; i++) {
            new Thread(() -> {
                while (true) {
                    synchronized (cars) {
                        while (cars.size() == maxList) {
                            try {
                                cars.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        Car car = new Car("Car");
                        cars.add(car);
                        System.out.println("The park size is :" + cars.size());
                        System.out.println(car);
                        cars.notifyAll();
                    }
                }
            }).start();
        }
        for (int i = 0; i < numConsumer; i++) {
            new Thread(() -> {
                while (true) {
                    synchronized (cars) {
                        while (cars.isEmpty()) {
                            try {
                                cars.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        cars.remove(0);
                        System.out.println("A car is removed.");
                        cars.notifyAll();
                    }
                }
            }).start();
        }
    }
}
