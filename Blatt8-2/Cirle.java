public class Cirle {
    protected int x,y,radius;

    public Cirle (int x,int y,int radius){
        this.x = x;
        this.y = y;
        this.radis = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Double getSurface(){
        return 3.14 * radius * radius;
    }

    public void move(int x, int y ){
        this.x = x;
        this.y = y;
    }
}