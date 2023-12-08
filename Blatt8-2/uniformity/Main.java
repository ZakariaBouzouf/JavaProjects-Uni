public class Main {
    public static void main(String[] args) {
        Figure rec1 = new Rectangle(0,0,20,20);
        Figure rec2 = new Rectangle(0,0,20,20);
        Figure rec3 = new Rectangle(0,0,20,20);

        Figure cir1 = new Circle(0,0,2);
        Figure cir2 = new Circle(0,0,2);

        Figure group = new GroupFigure();
        if (group instanceof GroupFigure){
            GroupFigure newgroup = (GroupFigure)group ;

            newgroup.addFigure(rec1);
            newgroup.addFigure(rec2);
            newgroup.addFigure(rec3);
            newgroup.addFigure(cir1);
            newgroup.addFigure(cir2);
        }

        System.out.println(group.getSurface());
    }
}
