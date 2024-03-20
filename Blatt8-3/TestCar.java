public class TestCar implements Car{
    protected Engine engine;
    protected List<Seat> seats;
    protected Color color ;
    protected Boolean testDrive;
    protected Boolean fuel;

    public Engine getEngine(){
        return engine;
    };
    public List<Seat> getSeats(){
        return seats;
    };
    public Color getColor(){
        return Color;
    };
    public void fuelUp(){
        fuel = true;
    };
    public boolean testDrive(){
        return testDrive;
    };
}
