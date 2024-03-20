public class ConcreteCarPartFactory2 implements CarPartFactory{
    public Engine buildEngine(){
        return new ConcreteEngine2();
    }
    public Seat buildSeat(Color color){
        return new ConcreteSeat2(color);
    }
}
