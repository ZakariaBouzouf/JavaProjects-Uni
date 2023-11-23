import java.util.Arrays;
final class Person {
    private int alt;
    private String vorname;
    private String nachname;
    private double gross;
    // Construtor
    public Person (){}
    public Person (int alt, String vorname, String nachname, double gross){
        this.alt = alt;
        this.vorname = vorname;
        this.nachname = nachname;
        this.gross = gross;
    }
    //Getter und Setter
    public void setAlt(int alt){
        if(alt<0){
            alt = 0;
        }
        this.alt = alt;
    }
    public int getAlt(){
        return alt;
    }
    public void setVorname(String vorname){
        this.vorname = vorname;
    }
    public String getVorname(){
        return vorname;
    }
    public void setNachname(String nachname){
        this.nachname = nachname;
    }
    public String getNachname(){
        return nachname;
    }
    public void setGross(double gross){
        this.gross = gross;
    }
    public double getGross(){
        return gross;
    }
    //To String
    public String toString(){
        return "Mein name ist " + vorname + " " + nachname + ", ich bin "+ alt + " Jahr alt, und ich bin " + gross + " Meter.";
    }


}
