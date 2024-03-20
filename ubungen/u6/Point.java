public class Point {
  protected int x,y;
  public Point(int x, int y ){
    this.x = x;
    this.y = y;
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

  @Override
  public boolean equals(Object o){
    if (this == o ) return true;
    if(!(o instanceof Point )) {
      return false;
    }
    Point point = (Point) o;
    return ((x == point.x) && (x == point.y));
  }

}
