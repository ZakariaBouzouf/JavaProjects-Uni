public class ColorPoint extends Point{
  Color color ;

  public ColorPoint(int x,int y, Color color){
    super(x,y);
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  @Override
  public boolean equals(Object o){
    if (this == o ) return true;
    if(!(o instanceof ColorPoint)) return false;
    ColorPoint colorPoint = (ColorPoint) o;
    return ((color.equals(colorPoint.color)) && (colorPoint.x==this.x) && (colorPoint.y==this.y));
  }
}
