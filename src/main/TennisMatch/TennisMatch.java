package TennisMatch;

import Data.Player;
import State.MatchType;
import Exception.*;
import TennisSet.*;


public class TennisMatch {

    private TennisSet tennisSet;
    private MatchType matchType;

    public TennisMatch(Player p1, Player p2, MatchType match,boolean tieBreak)
    {
        this.matchType = match;
        if(tieBreak)
            this.tennisSet = new TieBreakTennisSet(p1,p2);
        else
            this.tennisSet = new SimpleTennisSet(p1,p2);
    }

    public void updateWithPointWonBy(Player p)
    {

    }

    public String pointsForPlayer(Player p) throws InvalidPlayerException {
         return tennisSet.getGamePoint(p);
    }

    public String gamesInCurrentSetForPlayer(Player p) throws InvalidPlayerException {
        return tennisSet.getSetPoint(p);
    }

    public int currentSetNumber()
    {
        return 1;
    }

    public int gamesInSetForPlayer(int i,Player p)
    {
        return 1;
    }

    public boolean isFinished()
    {
        return false;
    }

}
