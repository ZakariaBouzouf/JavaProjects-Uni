public class UFOEnemyFactory extends EnemyShipFactory{
 @Override 
  public EnemyShip makeEnemyShip(String name){
    EnemyShip ship = new UFOEnemyShip(name);
    return ship;
  }
}
