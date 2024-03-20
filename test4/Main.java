public class Main {
  public static void main(String[] args) {
    Buch buch = new Medium();
    // Medium medium = new Buch();
    buch.setId(100);
    buch.setSeite(200);
    // Medium medium = buch;
    // medium.setId(12);
    // medium.setSeite(123);
    // if (medium instanceof Buch ){
    // System.out.println("True");
    // }
    //

    // if (buch instanceof Medium ){
    // System.out.println("True");
    // }
    // buch.setId(12);
    // buch.setSeite(100);
    System.out.println(buch.getId());
    System.out.println(buch.getSeite());
    System.out.println(buch.getClass());
    // System.out.println(medium.getId());
    // System.out.println(medium.getClass());
    // System.out.println(medium.getType());
    // System.out.println(medium.getSeite());

    // buch.setId(12);
    // buch.setSeite(100);
    // System.out.println(buch.getId());
    // System.out.println(buch.getSeite());
    // medium.setId(12);
    // medium.setSeite(100);
    // System.out.println(medium.getId());
    // System.out.println(medium.getSeite());
  }
}
