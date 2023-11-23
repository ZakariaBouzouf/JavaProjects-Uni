public abstract class Bird{
    protected String name ;
    protected int age ;
    protected double weight;

    public Bird(){}
    public Bird(String name, int age, double weight ){
        this.name = name;
        this.age = age;
        this.weight = weight;
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

