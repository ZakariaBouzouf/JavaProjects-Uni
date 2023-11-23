public class CantFly implements FlyBehaviour{
    public double getMaxAirSpeed() {
        return 0;
    }
    public void setMaxAirSpeed(double maxAirSpeed) {
    }
    public void fly() {
        System.out.println("Ich kann nicht so hoch fliegen.");
    };

    public void liftOff() {
        System.out.println("Ich kann langsam landen.");
    };

    public void land() {
        System.out.println("Ich lande langsam.");
    };

    public void eatFood() {
        System.out.println("Ich esse kleinere");
    };

}
