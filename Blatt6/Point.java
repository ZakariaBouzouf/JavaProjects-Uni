public class Point implements Cloneable {
    protected int x,y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    //Clone constructor
    public Point(Point other){
        this.x = other.x;
        this.y = other.y;
    }

    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }

    public String toString(){
        return String.format("The point is in (%s,%s)",x,y);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o ;
        return ((x==point.x) && (y==point.y));
    }
    //Hashcode methode
    @Override
    public int hashCode(){
        int result = Integer.hashCode(x);
        result = 31 * result + Integer.hashCode(y);
        return result;
    }
    //Cloneable
    @Override
    public Point clone(){
        try{
        return (Point) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
