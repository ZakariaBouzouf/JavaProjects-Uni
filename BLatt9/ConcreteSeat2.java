public class ConcreteSeat2 implements Seat {
    protected Color color;

    public ConcreteSeat2(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
