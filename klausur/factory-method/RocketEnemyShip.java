public class RocketEnemyShip extends EnemyShip{
  private String name;
  
  public RocketEnemyShip(String name){
    this.name = name;
  }

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }

  @Override
  public void build(){
    System.out.println("Building a RocketEnemyShip. And my name is "+ this.name);
  }
}
