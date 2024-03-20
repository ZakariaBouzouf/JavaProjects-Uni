public class ConcreteFactoryCar extends CarFactory{
    public Car build(Color carColor,Color seatColor){
        return new ConcreteCar(carColor, seatColor);
    }
}
