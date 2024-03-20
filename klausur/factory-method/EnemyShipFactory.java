public abstract class EnemyShipFactory {
  public EnemyShip create(String name){
    EnemyShip ship = makeEnemyShip(name);
    ship.build();
    return ship;
  }

  public abstract EnemyShip makeEnemyShip(String name);

}
