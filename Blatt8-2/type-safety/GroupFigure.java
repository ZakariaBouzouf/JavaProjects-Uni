import java.util.ArrayList;
import java.util.List;

public class GroupFigure implements Figure{
    private List<Figure> figures = new ArrayList<>();

    public void addFigure(Figure f){
        figures.add(f);
    }

    public void removeFigure(Figure f){
        figures.remove(f);
    }

    public Double getSurface(){
        double surface=0;
        for (Figure f : figures){
            surface = surface + f.getSurface();
        }
        return surface;
    }

    public void move(int x,int y){
        for (Figure f : figures){
            f.move(x,y);
        }
    }
}
