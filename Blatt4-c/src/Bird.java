public abstract class Bird{
    protected String name ;
    protected int age ;
    protected double weight;
    protected FlyBehaviour flyBehaviour;
    protected SwimBehaviour swimBehaviour;

    public Bird(){}
    public Bird(String name, int age, double weight,FlyBehaviour flyBehaviour, SwimBehaviour swimBehaviour){
        this.flyBehaviour = flyBehaviour;
        this.swimBehaviour = swimBehaviour;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }
    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }
    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }
    public SwimBehaviour getSwimBehaviour() {
        return swimBehaviour;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public abstract void eatFood();
}

