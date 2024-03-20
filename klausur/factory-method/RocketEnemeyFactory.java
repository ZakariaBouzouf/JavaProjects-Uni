public class RocketEnemeyFactory extends EnemyShipFactory{
 @Override 
  public EnemyShip makeEnemyShip(String name){
    EnemyShip ship = new RocketEnemyShip(name);
    return ship;
  }
}
