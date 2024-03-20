import java.util.List;

public class Car implements Product {
    protected Engine engine;
    protected List<Seat> seats;
    protected Color color ;
    protected Boolean testDrive;
    protected Boolean fuel;


    public Car(Color carColor ,Color seatColor,List<Seat> seats,Engine engine){
        this.seats = seats;
        this.engine = engine;
        this.color = carColor;
        for (Seat s : seats){
            s.setColor(seatColor);
        }
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

}
