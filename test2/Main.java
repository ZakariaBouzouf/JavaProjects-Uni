public class Main {
    public static void exo(int a) throws Exception {
        if (a <0 ){
            throw new IllegalAccessException("You cannot.");
        }else System.out.println("Bingo");
    }
    public static void main(String[] args) {
        byte red = 4;
        byte green= (byte) 200;

        System.out.println(green);
        try {
            exo(-55);
        } catch (Exception e) {
            System.out.println("Caught exceptions," + e.getMessage());
        }
    }
}
