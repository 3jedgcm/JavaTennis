package TennisMatch;

import Data.Player;
import Exception.*;
import State.MatchType;

public class PointBO  {

    private Player player1;
    private Player player2;
    private int max_to_win = 3;
    private int point1;
    private int point2;

    public PointBO(Player p1, Player p2, MatchType pointMatchState)
    {
        this.max_to_win = Integer.parseInt(pointMatchState.toString());
        this.player1 = p1;
        this.player2 = p2;
        this.point1 = 0;
        this.point2 = 0;
    }


    public void addPoint(Player p) throws InvalidPlayerException,IsAlreadyWinException {
        if(this.isWin(p))
        {
            throw new IsAlreadyWinException();
        }
        else
        {
            if(p.equals(player1)) {
                point1++;
            }
            else if(p.equals(player2)) {
                point2++;
            }
            else {
                throw new InvalidPlayerException();
            }
        }

    }

    public boolean isWin(Player p) throws InvalidPlayerException {
        return this.getPlayerPoint(p) >= this.max_to_win;
    }


    public int getPlayerPoint(Player p) throws InvalidPlayerException {
        if(p.equals(player1)) {
            return this.point1;
        }
        else if(p.equals(player2)) {
            return this.point2;
        }
        else {
            throw new InvalidPlayerException();
        }
    }

    @Override
    public String toString() {
        return "BO[" +
                "Player 1: " + point1 +
                " Player 2: " + point2 +
                " ] ";
    }
}
