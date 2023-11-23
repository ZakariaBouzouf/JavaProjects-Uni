public class Eagle extends Bird{
    public int height = 344;
    public int age = super.age + 10;

    public void makeNoise(){
        System.out.println("Eagle make noise");
    }
    public void fly(){
        System.out.println("Fly");
    super.makeNoise(); 
    }
    // public void super.fly();
}
