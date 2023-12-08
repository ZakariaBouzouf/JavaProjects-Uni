public class Main {
    public static void main(String[] args) {
        // Buch buch = new Buch();
        Medium medium = new Buch();
        medium.setId(12);
        Buch buch = (Buch)medium;
        // if (medium instanceof Buch ){
        // System.out.println("True");
        // }
        //
        
        // if (buch instanceof Medium ){
        // System.out.println("True");
        // }
        // buch.setId(12);
        buch.setSeite(100);
        System.out.println(buch.getId());
        System.out.println(buch.getSeite());


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
