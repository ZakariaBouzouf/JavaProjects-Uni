import java.util.List;

public class Car {
    protected Engine engine;
    protected List<Seat> seats;
    protected Color color;
    protected Boolean testDrive = false;
    protected Boolean fuel = false;
    public Car(Color carColor, List<Seat> seats, Engine engine) {
        this.seats = seats;
        this.engine = engine;
        this.color = carColor;
    List 
    }
    public Engine getEngine() {
        return engine;
    };

    public List<Seat> getSeats() {
        return seats;
    };

    public Color getColor() {
        return color;
    };

    public void fuelUp() {
        fuel = true;
    };

    public boolean testDrive() {
        return testDrive;
    };

    public String toString() {
        return String.format("I'm a car my engine ist from : %s.", engine);
    }
}
