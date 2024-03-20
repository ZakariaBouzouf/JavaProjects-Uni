import java.util.List;

public interface Car{
    public void manufacturing();
    public Engine getEngine();
    public List<Seat> getSeats();
    public Color getColor();
    public void fuelUp();
    public boolean testDrive();

}
