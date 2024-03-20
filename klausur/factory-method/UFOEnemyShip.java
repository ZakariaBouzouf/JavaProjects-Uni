public class UFOEnemyShip extends EnemyShip{
  private String name;

  public UFOEnemyShip(String name){
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
    System.out.println("Building a UFOEnemyShip. And my name is "+ this.name);
  }
}
