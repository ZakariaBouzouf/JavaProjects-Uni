public class ConcreteSeat1 implements Seat{
    protected Color color;

    public ConcreteSeat1 (Color color){
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
