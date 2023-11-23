public class ColorPoint extends Point {
    // protected Color color = new Color(byte red,byte green,byte blue);
    protected Color color;

    // public ColorPoint (int x, int y ,byte red, byte green,byte blue){
    public ColorPoint (int x, int y ,int red, int green,int blue){
        super(x,y);
        if (red>=0 && red<=255 && green>=0 && green <= 255 && blue >= 0 && blue<=255){
            color = new Color((byte)red,(byte)green,(byte)blue);
        }
    }
    //Equals methode
    @Override
    public boolean equals(Object o){
        if (this == o ) return true;
        if (!(o instanceof ColorPoint)) return false;
        ColorPoint colorpoint = (ColorPoint) o;
        return (x==colorpoint.x && y==colorpoint.y &&color.equals(colorpoint.color));
    }

    public String toString(){
        return String.format("The point is in (%s, %s) and has a %s color.",x,y,color);
    }

    @Override
    public int hashCode(){
        int result = Integer.hashCode(x);
        result = 31 * result + Integer.hashCode(y);
        result = 31 *result + color.hashCode();
        return result;
    }
    
    

}
