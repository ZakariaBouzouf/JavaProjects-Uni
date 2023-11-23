public class Penguin extends Bird {
    public Penguin(String name,int age,double weight,FlyBehaviour flyBehaviour,SwimBehaviour swimBehaviour){
        super(name,age,weight,new CantFly());
    }

    public void fly(){
        System.out.println("Ich kann nicht so hoch fliegen.");
    };
    public void liftOff(){
        System.out.println("Ich kann langsam landen.");
    };
    public void land(){
        System.out.println("Ich lande langsam.");
    };
    public void eatFood(){
        System.out.println("Ich esse kleinere");
    };
}
