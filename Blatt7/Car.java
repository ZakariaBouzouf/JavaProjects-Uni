import java.util.List;

public class Car extends Vehicule {
    protected String model ;
    protected Engine engine;
    protected List<Seat> seats;
    protected List<Wheel> wheels;

    public Car (int id,String model, Engine engine, List<Seat> seats, List<Wheel> wheels){
        super(id);
        this.model = model;
        this.engine = engine;
        this.seats = seats;
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }
    
    public String toString(){
        return String.format("Id: %s, Model: %s, Engine: %s, Wheels: %s, Seats: %s.", id,model,wheels,seats);
    }
    
}
