import java.util.ArrayList;
import java.util.List;

public class ParkPlatz {
    private final List<Car> cars = new ArrayList();
    private final int maxList = 30;
    public List<Car> getCars() {
        return cars;
    }
    public int getMaxList() {
        return maxList;
    }

}
