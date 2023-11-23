import java.util.ArrayList;
import java.util.Collection;

public class SecuritySystem {
    public Collection<EmployeeID> employes = new ArrayList<>();
    Map map = new Map();

    public SecuritySystem(){};

    public void addEmployee(EmployeeID employee){
        employes.add(employee);
    }
    public void removeEmployee(EmployeeID employee){
        employes.remove(employee);
    }
    public Boolean isEmployed(EmployeeID employee){
        return employes.contains(employee);
    }
    public EmployeeID getEmployeeByUID(int UID){
        for (EmployeeID employe : employes){
            if (employe.UID == UID){
                return employe;
                // System.out.println(employe);
            }
        }
        return null;
    }

    public void addArea(String areaName, SecurityAccessLevel accessLevel){
        Area newArea = new Area(areaName,accessLevel);
        map.addArea(newArea);
    }
    public void removeArea(String areaName){
        map.removeArea(areaName);
    }
    public Boolean hasAccess(EmployeeID employee, String area){
        if (employee.accessLevel.ordinal() >= map.getSecurityAccessLevel(area).ordinal()){
            return true;
        }else{
            return false;
        }
    }

    public Collection<EmployeeID> getEmployes(){
        return employes;
    }




}
