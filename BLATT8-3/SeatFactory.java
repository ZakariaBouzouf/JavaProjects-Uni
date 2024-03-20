public class SeatFactory extends Fabrik{
    @Override
    public Product build(Color carColor,Color seatColor) {
        return new Seat();
    }

}
