
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Integer fibonacci(int index ){
        int a = 0;
        int b = 1;
        if (index == 0) {
            return a;
        } else if (index == 1) {
            return b;
        }else {
            return fibonacci(index-1) + fibonacci(index-2);
        }
    };
    public static Integer fibonacci2(int index){
        int a = 0;
        int b = 1;
        int c = 0;
        if (index < 2){
            return index;
        }
        for (int i = 2; i<=index; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c ;
    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        for (int i=0 ; i<42 ; i++){
            //System.out.println(fibonacci(i));
            //System.out.print('Methode 2');

            System.out.println(i + " " + fibonacci2(i));


        }
    }
}
