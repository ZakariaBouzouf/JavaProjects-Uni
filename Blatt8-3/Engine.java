public class Engine implements Product {
    protected int numberOfPistons;
    protected int size;
    protected int fuelConsumption;

    public int getNumberofPistons(){
        return numberOfPistons;
    }
    public int getSize(){
        return size;
    } 
    public int getFuelConsumption(){
        return fuelConsumption;
    }

    @Override
    public void manufacturing(){
        System.out.println("Engine is in process of manufacturing.");
    }
}
