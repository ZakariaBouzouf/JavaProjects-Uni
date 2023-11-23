public class Birthday {
    protected int day,jahr;
    protected Month month;

    public Birthday(int day, Month month, int jahr){
        if (jahr>0){
            this.jahr = jahr;
        }
        if (day > 1 && day<= month.getDay()){
            this.day = day;
            this.month = month;
        }
    }
    
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(Month month){
        this.month = month;
    }
    public void setYear(int jahr){
        this.jahr = jahr;
    }

    public int getDay(){
        return day;
    }
    public Month getMonth(){
        return month;
    }
    public int getJahr(){
        return jahr;
    }
    @Override
    public String toString(){
        return " Day : " + day + " Month : " +month + " Year : " + jahr;

    }
}
