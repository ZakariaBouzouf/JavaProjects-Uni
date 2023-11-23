public abstract class Bird{
    protected String name;
    protected int age;
    protected double weight;
    protected FlyBehaviour flyBehaviour;
    protected SwimBehaviour swimBehaviour;

    public Bird() {
    }

    public Bird(String name, int age, double weight, FlyBehaviour flyBehaviour, SwimBehaviour swimBehaviour) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.flyBehaviour = flyBehaviour;
        this.swimBehaviour = swimBehaviour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public abstract void fly();

    public abstract void liftOff();

    public abstract void land();

    public abstract void eatFood();
}
