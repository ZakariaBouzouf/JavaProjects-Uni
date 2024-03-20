import java.util.ArrayList;
import java.util.List;

abstract class CarFactory {
    public Car order(Color carColor, Color seatColor) {
        Car car = build(carColor, seatColor);
        return car;
    }

    public abstract Car build(Color carColor, Color seatColor);
}
