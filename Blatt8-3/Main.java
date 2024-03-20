public class Main {
    public static void main(String[] args) {
        Fabrik carFactory = new CarFactory();
        Product car = carFactory.order(Color.RED,Color.GREEN);
    }
}
