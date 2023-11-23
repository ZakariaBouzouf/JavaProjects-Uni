public class EmployeeID {
    String vorname,nachname;
    Address address;
Birthday birthday;
static int idCounter=1 ;
    int UID = idCounter;
	SecurityAccessLevel accessLevel;

    public EmployeeID(String vorname, String nachname, Address address,Birthday birthday, SecurityAccessLevel accessLevel){
	this.accessLevel = accessLevel;
        this.vorname = vorname;
        this.nachname = nachname;
        this.address = address;
        this.birthday = birthday;
	idCounter++;
    }

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Birthday getBirthday() {
		return birthday;
	}

	public void setBirthday(Birthday birthday) {
		this.birthday = birthday;
	}
	public int getUid() {
		return UID;
	}
	public void setUid(int uid) {
		this.UID= uid;
	}

    @Override
    public String toString() {
        return "Nachname : " + nachname +" Vorname : " +vorname+" ID :" + UID +" ,with the sec : " +accessLevel+"\n And he is born "+ birthday ;
    }


}
