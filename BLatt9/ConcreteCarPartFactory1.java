public class ConcreteCarPartFactory1 implements CarPartFactory{
    public Engine buildEngine(){
        return new ConcreteEngine1();
    }
    public Seat buildSeat(Color color){
        return new ConcreteSeat1(color);
    }
}
