public class Eagle extends Bird {
    public Eagle(String name,int age,double weight){
        super(name,age,weight,new GoodFlyer(),new CantSwim());
    }
    public void eatFood(){
        System.out.println("I can eat anything.");
    }
}
