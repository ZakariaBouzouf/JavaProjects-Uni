public class CounterPoint extends Point{
    static int count = 0;
    public CounterPoint(int x, int y){
        super(x,y);
        count++;
    }
    // public CounterPoint(CounterPoint counterPoint){
    //     super(counterPoint.x,counterPoint.y);
    // }
    public void setCount(int count){
        this.count = this.count+count;
    }
    public int getCount(){
        return count;
    }
}
