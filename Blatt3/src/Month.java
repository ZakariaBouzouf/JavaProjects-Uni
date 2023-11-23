public enum Month {
    JANUAR(31),
    FEBRUAR(29),
    MARS(31),
    APRIL(30),
    MAI(31),
    JUNI(30),
    JULY(31),
    AGUST(30),
    SEPTEMBRE(31),
    OKTOBER(30),
    NOVEMBER(31),
    DEZEMBRE(30);

    private final int day;

    Month (int day){
        this.day = day;
    }

    public int getDay(){
        return day;
    }
}
