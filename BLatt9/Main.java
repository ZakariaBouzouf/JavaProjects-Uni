public class Main {
    public static void main(String[] args) {
        CarDealerShip carDealerShip = new CarDealerShip(new ConcreteCarPartFactory1());
        Car car = carDealerShip.order(Color.RED,Color.BLUE);
        System.out.println(car);

        CarDealerShip carDealerShip2 = new CarDealerShip(new ConcreteCarPartFactory2());
        Car car2 = carDealerShip2.order(Color.RED,Color.BLUE);
        System.out.println(car2);
    }
}
