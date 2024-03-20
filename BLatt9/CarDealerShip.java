import java.util.ArrayList;
import java.util.List;

public class CarDealerShip {
    protected CarPartFactory partFactory;

    public CarDealerShip(CarPartFactory partFactory){
        this.partFactory = partFactory;
    };

    public Car order (Color seatColor, Color carColor){
        Engine engine = partFactory.buildEngine();
        Seat seat1 = partFactory.buildSeat(seatColor);
        Seat seat2 = partFactory.buildSeat(seatColor);
        List<Seat> seats = new ArrayList<>();
        seats.add(seat1);
        seats.add(seat2);

        
        return new Car(seatColor, seats, engine);
    }
}
