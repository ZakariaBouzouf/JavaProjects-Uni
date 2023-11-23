public class CounterPoint extends Point{
    public static int count = 0;
    public CounterPoint(int x, int y){
        super(x,y);
        count++;
    }
    public void setCount(int count){
        this.count = this.count+count;
    }
    public int getCount(){
        return count;
    }
}
