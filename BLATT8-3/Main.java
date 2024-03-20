public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new ConcreteFactoryCar();
        Car car = carFactory.order(Color.RED,Color.GREEN);
        System.out.println(car);
        System.out.println("Done.");
    }
}
