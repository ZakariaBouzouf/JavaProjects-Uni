public class Eagle extends Bird implements FlyingEntity{
    protected double maxAirSpeed;
    
    public Eagle(String name,int age,double weight,double maxAirSpeed){
        super(name,age,weight);
        this.maxAirSpeed = maxAirSpeed;
    }
    public double getMaxAirSpeed(){
        return maxAirSpeed;
    }
    public void setMaxAirSpeed(double maxAirSpeed){
        this.maxAirSpeed = maxAirSpeed;
    }
    public void eatFood(){
        System.out.println("I can eat anything.");
    }
    public void fly(){
        System.out.println("I can fly high.");
    }
    public void land(){
        System.out.println("I can land really fast.");
    }
    public void liftOff(){
        System.out.println("I can lift off really fast.");
    }
}
