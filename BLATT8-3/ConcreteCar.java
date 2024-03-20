import java.util.ArrayList;
import java.util.List;

public class ConcreteCar implements Car{
    protected Engine engine = new Engine();
    protected List<Seat> seats = new ArrayList<>();
    protected Color color ;
    protected Boolean testDrive;
    protected Boolean fuel;


    public ConcreteCar(Color carColor ,Color seatColor){
        Seat seat1 = new Seat(seatColor);
        Seat seat2 = new Seat(seatColor);
        this.seats.add(seat1);
        this.seats.add(seat2);
        this.color = carColor;
    }

    public void manufacturing(){
        System.out.println("The manufacturing of the Car is done.");
    }
    public Engine getEngine(){
        return engine;
    };
    public List<Seat> getSeats(){
        return seats;
    };
    public Color getColor(){
        return color;
    };
    public void fuelUp(){
        fuel = true;
    };
    public boolean testDrive(){
        return testDrive;
    };

    @Override
    public String toString(){
        return String.format("The car is building.");
    }
}
