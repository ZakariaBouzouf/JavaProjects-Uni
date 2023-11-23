import java.util.ArrayList;
import java.util.Collection;

public class Map {
    // MENSA(SecurityAccessLevel.LEVEL_2),
    // TOILETTEN(SecurityAccessLevel.LEVEL_1),
    // WERKSTATT(SecurityAccessLevel.LEVEL_3);
Collection<Area> areas = new ArrayList<>();

    public void addArea(Area area){
        areas.add(area);
    }
    public void removeArea(String areaName){
        for (Area area : areas){
            if (area.areaName == areaName){
                areas.remove(area);
            }
        }
    }
    public SecurityAccessLevel getSecurityAccessLevel(String areaName){
        for (Area area : areas){
            if (area.areaName == areaName){
                return area.accessLevel;
            }
        }
        return null;
    }
    // public Area getArea(Area areaGiven){
    //     for(Area area :areas){
    //         if (area.areaName == areaGiven.areaName){
    //             return area;
    //         }
    //     }
    // }
    public Collection<Area> getAreas(){
        return areas;
    }
}
