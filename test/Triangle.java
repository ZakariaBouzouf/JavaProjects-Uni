public class Triangle <T extends Number>{
  private T a,b,c;

  public Triangle (T a,T b,T c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  
  public float surface (){
    return  a.floatValue()*b.floatValue()*c.floatValue();
  }
}
