import java.util.ArrayList;
import java.util.List;

public class CarFactory extends Fabrik {
    @Override
    public Product build(Color carColor, Color seatColor) {
        System.out.println("Car is in process of manufacturing.");
        Fabrik engineFactory = new EngineFactory();
        Product engine = engineFactory.order(Color.RED, Color.GREEN);

        Fabrik seatFactory = new SeatFactory();
        Product seat1 = seatFactory.order(Color.RED, Color.GREEN);
        Product seat2 = seatFactory.order(Color.RED, Color.GREEN);
        List<Seat> seats = new ArrayList<>();
        seats.add((Seat) seat1);
        seats.add((Seat) seat2);

        return new Car(carColor, seatColor, seats, (Engine) engine);
    }
    // @Override
    // public Product build(){
    // return new Car();
    // }
}
