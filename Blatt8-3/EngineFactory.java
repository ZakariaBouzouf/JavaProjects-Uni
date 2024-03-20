public class EngineFactory  extends Fabrik{
    @Override
    public Product build (Color carColor,Color seatColor){
        return new Engine();
    }
}
