public class Piston {
    protected Double thickness;

    public Piston(Double thickness){
        this.thickness = thickness;
    }

    public Double getThickness() {
        return thickness;
    }

    public void setThickness(Double thickness) {
        this.thickness = thickness;
    }

    public String toString(){
        return String.format("%s",thickness);
    }
}
