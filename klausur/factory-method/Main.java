public class Main {
  public static void main(String[] args) {
    EnemyShipFactory shipFactory = new RocketEnemeyFactory();
    EnemyShip ship = shipFactory.create("Test");
    
    EnemyShipFactory shipFactory2 = new UFOEnemyFactory();
    EnemyShip ship2 = shipFactory2.create("test2");
  }
}
