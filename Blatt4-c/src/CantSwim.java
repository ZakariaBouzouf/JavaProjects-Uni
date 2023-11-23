public class CantSwim implements SwimBehaviour {
    public double getMaxWaterSpeed() {
        return 0;
    };

    public void setMaxWaterSpeed(double maxWaterSpeed) {};

    public void jumpIntoWater() {
    };

    public void leaveWater() {
        System.out.println("I can't swim.");
    }

    public void swim() {
        System.out.println("I can't swim.");
    }
}
