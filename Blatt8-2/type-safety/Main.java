public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(0,0,20,20);
        Rectangle rec2 = new Rectangle(0,0,20,20);
        Rectangle rec3 = new Rectangle(0,0,20,20);

        Circle cir1 = new Circle(0,0,2);
        Circle cir2 = new Circle(0,0,2);

        GroupFigure group = new GroupFigure();
            group.addFigure(rec1);
            group.addFigure(rec2);
            group.addFigure(rec3);
            group.addFigure(cir1);
            group.addFigure(cir2);

        System.out.println(group.getSurface());
    }
}
