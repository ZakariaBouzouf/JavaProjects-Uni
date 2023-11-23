public class ColorPoint2 {
    private Point point;
    private Color color;

    public ColorPoint2(int x,int y ,int red , int green, int blue){
        this.point = new Point(x,y);
        if (red>=0 && red<=255 && green>=0 && green <= 255 && blue >= 0 && blue<=255){
            color = new Color((byte)red,(byte)green,(byte)blue);
        }
    }

    @Override
    public boolean equals(Object o){
        if (this == o ) return true;
        if (!(o instanceof ColorPoint)) return false;
        ColorPoint2 colorpoint = (ColorPoint2) o;
        return (point.x==colorpoint.point.x && point.y==colorpoint.point.y &&color.equals(colorpoint.color));
    }

    public String toString(){
        return String.format("The point is in (%s, %s) and has a %s color.",point.x,point.y,color);
    }
}
