public class GoodFlyer implements FlyBehaviour {
    double maxAirSpeed;
    public double getMaxAirSpeed(){
        return maxAirSpeed;
    }
    public void setMaxAirSpeed(double maxAirSpeed){
        this.maxAirSpeed = maxAirSpeed;
    }
    public void fly(){
        System.out.println("I can fly really high.");
    }
    public void land(){
        System.out.println("I can land really fast.");
    }
    public void liftOff(){
        System.out.println("I can lift off really fast.");
    }
}
