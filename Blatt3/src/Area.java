public class Area{
    protected String areaName;
    protected SecurityAccessLevel accessLevel;

    public Area(String areaName, SecurityAccessLevel accessLevel){
        this.areaName = areaName;
        this.accessLevel = accessLevel;
    }
    public String getAreaName(){
        return areaName;
    }
    public void setAreaName(String areaName){
        this.areaName = areaName;
    }
    public SecurityAccessLevel getAccessLevel() {
        return accessLevel;
    }
    public void setAccessLevel(SecurityAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

}
