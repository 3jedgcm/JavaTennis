package TennisMatch;

import Data.Player;
import State.MatchType;
import Exception.*;
import TennisSet.*;

import java.util.ArrayList;


public class TennisMatch {

    private TennisSet tennisSet;
    private MatchType matchType;
    private boolean tieBreak;
    private ArrayList<TennisSet> setHistory = new ArrayList();
    private Player player1;
    private Player player2;
    private PointBO bo;



    public TennisMatch(Player p1, Player p2, MatchType match,boolean tieBreak)
    {
        this.bo = new PointBO(p1,p2,match);
        this.player1 = p1;
        this.player2 = p2;
        this.matchType = match;
        this.newSet();
    }

    public void updateWithPointWonBy(Player p) throws InvalidPlayerException, InvalidPlayerStateException, IsAlreadyWinException {
        this.tennisSet.addPoint(p);
        if(this.tennisSet.isWin(this.player1))
        {
            this.bo.addPoint(this.player1);
            this.addSetInHistory();
            this.newSet();
        }
        else if(this.tennisSet.isWin(this.player2))
        {
            this.bo.addPoint(this.player2);
            this.addSetInHistory();
            this.newSet();
        }
    }

    private void newSet()
    {
        if(this.tieBreak)
            this.tennisSet = new TieBreakTennisSet(this.player1,this.player2);
        else
            this.tennisSet = new SimpleTennisSet(this.player1,this.player2);
    }

    private void addSetInHistory()
    {
        setHistory.add(this.tennisSet);
    }

    public String pointsForPlayer(Player p) throws InvalidPlayerException {
         return tennisSet.getGamePoint(p);
    }

    public String gamesInCurrentSetForPlayer(Player p) throws InvalidPlayerException {
        return tennisSet.getSetPoint(p);
    }

    public String gamesInSetForPlayer(int i,Player p) throws InvalidPlayerException {
       return this.setHistory.get(i).getGamePoint(p);
    }

    public String currentSetNumber() throws InvalidPlayerException {
        return ""+bo.getPlayerPoint(player1) + bo.getPlayerPoint(player2) + 1;
    }

    public boolean isFinished() throws InvalidPlayerException {
        return this.bo.isWin(this.player1) || this.bo.isWin(this.player2);
    }

    @Override
    public String toString() {
        return "TennisMatch -> "
                 + bo.toString() + " -> "
                 + tennisSet.toString() + " -> "
                 + tennisSet.toStringGame();
    }
}
