public class Engine {
    protected Double size;
    protected List<Piston> pistons;

    public Engine(Double size, List<Piston> pistons){
        this.size = size;
        this.pistons = pistons;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public List<Piston> getPistons() {
        return pistons;
    }

    public void setPistons(List<Piston> pistons) {
        this.pistons = pistons;
    }

    public String toString(){
        return String.format("Size: %s,Pistons: %s", size,pistons);
    }
}
