public abstract class EnemyShip{
  private String name;
  private double amtDamage;

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public void setDamage(double amtDamage){
    this.amtDamage = amtDamage;
  };
  public double getDamage(){
    return this.amtDamage;
  }

  public abstract void build();
 

  public void followHeroShip(){};
  public void displayEnemyShip(){};
  public void enemyShipShoots(){};

}
