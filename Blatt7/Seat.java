public class Seat {
    protected Color color ;

    public Seat (Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String toString(){
        return String.format("%s",color);
    }


}
