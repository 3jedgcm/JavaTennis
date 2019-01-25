import Data.Player;
import TennisSet.TennisSet;
import TennisSet.*;

public class Main {
    public static void main (String[] args){
        Player p1 = new Player("Coralie");
        Player p2 = new Player("Johana");

        TennisSet testSet = new TieBreakTennisSet(p1,p2);

        try
        {
            //SET 1
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            //SET 2
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            //SET 3
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            //SET 4
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            //SET 5
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            //SET 1
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            //SET 2
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            //SET 3
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            //SET 4
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            //SET 5
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            //SET 5
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            //SET 5
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            testSet.addPoint(p1);

            testSet.addPoint(p1);
            testSet.addPoint(p1);
            testSet.addPoint(p1);
            testSet.addPoint(p1);

            testSet.addPoint(p2);
            testSet.addPoint(p2);
            testSet.addPoint(p2);
            testSet.addPoint(p2);

            System.out.println(testSet.toString());
            System.out.println(testSet.toStringGame());
        }
        catch (Exception e)
        {
            System.out.println("ERROR");
        }

    }


}
