import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Color color;
        Piston piston1 = new Piston(2.4);
        Piston piston2 = new Piston(2.4);
        Piston piston3 = new Piston(2.4);
        List<Piston> pistons = new ArrayList<>();
        pistons.add(piston1);
        pistons.add(piston2);
        pistons.add(piston3);
        
        Engine engine = new Engine(23.4,pistons);

        Seat seat1 = new Seat(color.RED);
        Seat seat2 = new Seat(color.BLUE);
        Seat seat3 = new Seat(color.ORANGE);
        List<Seat> seats = new ArrayList<>();
        seats.add(seat1);
        seats.add(seat2);
        seats.add(seat3);

        Wheel wheel1 = new Wheel(2.4);
        Wheel wheel2 = new Wheel(2.4);
        Wheel wheel3 = new Wheel(2.4);
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(wheel1);
        wheels.add(wheel2);
        wheels.add(wheel3);

        Car car1 = new Car(001,"BMW",engine,seats,wheels);
    }
}
