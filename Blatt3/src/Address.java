public class Address {
    protected int postleitzahl;
    protected String strass;
    protected int haus;
    public Address (int postleitzahl, String strass, int haus){
        this.postleitzahl = postleitzahl;
        this.strass = strass;
        this.haus = haus;
    }
    public void getPost(int postleitzahl){
        this.postleitzahl = postleitzahl; 
    }
    public void getStrass(String strass){
        this.strass = strass;
    }
    public void getHaus(int haus){
        this.haus = haus;
    }
    public int setPost(){
        return postleitzahl;
    }
    public String setStrass(){
        return strass;
    }
    public int setHaus(){
        return haus;
    }
}
