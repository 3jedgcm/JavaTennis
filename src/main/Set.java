import java.util.ArrayList;
import java.util.List;

public class Set
{
    private List<Point> playerPoint;
    private int pointOfPlayerOne;
    private int pointOfplayerTwo;




    public Set()
    {
        init();



    }


    private void init()
    {
        this.playerPoint = new ArrayList<Point>();
        this.playerPoint.add(Point.LOVE);
        this.playerPoint.add(Point.FIFTEEN);
        this.playerPoint.add(Point.THIRTY);
        this.playerPoint.add(Point.FORTY);
        this.playerPoint.add(Point.ADVANTAGE);

        this.pointOfPlayerOne = 0;
        this.pointOfplayerTwo = 1;


    }






}
