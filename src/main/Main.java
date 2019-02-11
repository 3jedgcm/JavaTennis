import Data.Player;
import State.MatchType;
import TennisMatch.TennisMatch;
import TennisSet.TennisSet;
import TennisSet.*;

public class Main {
    public static void main (String[] args){
        Player p1 = new Player("Coralie");
        Player p2 = new Player("Johana");

        TennisMatch tennisMatch = new TennisMatch(p1,p2, MatchType.BEST_OF_THREE,true);

        try
        {

            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);

            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);

            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);

            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);

            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);

            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);


            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);

            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);

            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);

            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);

            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);

            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);
            tennisMatch.updateWithPointWonBy(p1);



            System.out.println(tennisMatch.isFinished());

            System.out.println(tennisMatch.toString());
        }
        catch (Exception e)
        {
            System.out.println("ERROR");
        }

    }


}
