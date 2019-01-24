package TennisSet;

import Data.Player;

import State.*;
import TennisGame.*;
import Exception.*;

import static State.SimpleSetState.*;


public abstract class TennisSet {


    protected Player playerOne;
    protected Player playerTwo;
    protected SetState playerOneSetState;
    protected SetState playerTwoSetState;
    protected TennisGame game;


    public TennisSet(Player p1, Player p2) {
        this.playerOne = p1;
        this.playerTwo = p2;
    }

    protected SetState getStateAdversePlayer(Player p) throws InvalidPlayerException {

        if(playerOne.equals(p))
            return this.playerTwoSetState;
        else if(playerTwo.equals(p))
            return this.playerOneSetState;
        else
            throw new InvalidPlayerException();
    }

    protected SetState getStatePlayer(Player p) throws InvalidPlayerException {

        if(playerOne.equals(p))
            return this.playerOneSetState;
        else if(playerTwo.equals(p))
            return this.playerTwoSetState;
        else
            throw new InvalidPlayerException();
    }

    protected void setStatePlayer(Player p, SetState gs) throws InvalidPlayerException {
        if(playerOne.equals(p))
            this.playerOneSetState = gs;
        else if(playerTwo.equals(p))
            this.playerTwoSetState = gs;
        else
            throw new InvalidPlayerException();
    }

    protected void setStateAdversePlayer(Player p, SetState ss) throws InvalidPlayerException {
        if(playerOne.equals(p))
            this.playerTwoSetState = ss;
        else if(playerTwo.equals(p))
            this.playerOneSetState = ss;
        else
            throw new InvalidPlayerException();
    }

    protected abstract void init(Player p1, Player p2);

    public boolean isWin(Player p) throws InvalidPlayerException {
        return this.getStatePlayer(p) == WIN;
    }
    public abstract void addPoint(Player p) throws InvalidPlayerStateException, InvalidPlayerException;
    public abstract String getPoint(Player p) throws InvalidPlayerException;


    @Override
    public String toString() {
        return "TennisSet " +
                " PLAYER ONE : " + playerOneSetState +
                " SET PLAYER TWO : " + playerTwoSetState;
    }

    public String toStringGame()
    {
        return game.toString();
    }
}
