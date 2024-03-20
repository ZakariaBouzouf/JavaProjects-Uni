public class Seat implements Product{
    protected Color color;

    // public Seat(Color color){
    //     this.color = color
    // }
    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor(){
        return color;
    }

    @Override
    public void manufacturing(){
        System.out.println("Seat is in process of manufacturing.");
    } 
}
