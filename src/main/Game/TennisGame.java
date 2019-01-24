package Game;

import Data.Player;
import State.SetGameState;
import Exception.*;

import static State.SimpleGameState.WIN;

public abstract class TennisGame {

    protected Player playerOne;
    protected Player playerTwo;
    protected SetGameState playerOneState;
    protected SetGameState playerTwoState;

    public TennisGame(Player p1, Player p2) {
        this.playerOne = p1;
        this.playerTwo = p2;
    }

    protected SetGameState getStatePlayer(Player p) throws InvalidPlayerException {

        if(playerOne.equals(p))
            return playerOneState;
        else if(playerTwo.equals(p))
            return playerTwoState;
        else
            throw new InvalidPlayerException();
    }

    protected SetGameState getStateAdversePlayer(Player p) throws InvalidPlayerException {

        if(playerOne.equals(p))
            return playerTwoState;
        else if(playerTwo.equals(p))
            return playerOneState;
        else
            throw new InvalidPlayerException();
    }

    protected void setStatePlayer(Player p,SetGameState gs) throws InvalidPlayerException {
        if(playerOne.equals(p))
            this.playerOneState = gs;
        else if(playerTwo.equals(p))
            this.playerTwoState = gs;
        else
            throw new InvalidPlayerException();
    }

    protected void setStateAdversePlayer(Player p,SetGameState gs) throws InvalidPlayerException {
        if(playerOne.equals(p))
            this.playerTwoState = gs;
        else if(playerTwo.equals(p))
            this.playerOneState = gs;
        else
            throw new InvalidPlayerException();
    }

    public boolean isWin(Player p) throws InvalidPlayerException {
        return this.getStatePlayer(p) == WIN;
    }

    protected abstract void init();

    public abstract void addPoint(Player p) throws InvalidPlayerException, InvalidPlayerStateException;

}
