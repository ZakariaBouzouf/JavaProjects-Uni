public abstract class Bird {
    protected String name ;
    protected int age ;
    protected double weight;
    protected double maxAirSpeed;

    public Bird(){}
    public Bird(String name, int age, double weight, double maxAirSpeed){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.maxAirSpeed = maxAirSpeed;
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

    public void setSpeed(double maxAirSpeed){
        this.maxAirSpeed = maxAirSpeed;
    }
    public double getSpeed(){
        return maxAirSpeed;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    // public void fly(){
    //     System.out.println("Ich kann fliegen.");
    // };
    // public void liftOff(){
    //     System.out.println("Wenn ich müde bin, muss ich landen.");
    // };
    // public void land(){
    //     System.out.println("Ich kann landen.");
    // };
    // public void eatFood(){
    //     System.out.println("Ich esse.");
    // };

    public abstract void fly();
    public abstract void liftOff();
    public abstract void land();
    public abstract void eatFood();
}

