public class ConcreteEngine2 implements Engine {
    protected int numberOfPistons;
    protected int size;
    protected int fuelConsumption;

    public int getNumberofPistons() {
        return numberOfPistons;
    }

    public int getSize() {
        return size;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return String.format("Factory 2 ");
    }
}
