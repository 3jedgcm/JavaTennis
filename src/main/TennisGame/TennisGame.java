package TennisGame;

import Data.Player;
import State.GameState;
import Exception.*;

import static State.SimpleGameState.WIN;

public abstract class TennisGame {

    protected Player playerOne;
    protected Player playerTwo;
    protected GameState playerOneState;
    protected GameState playerTwoState;

    public TennisGame(Player p1, Player p2) {
        this.playerOne = p1;
        this.playerTwo = p2;
    }

    protected GameState getStatePlayer(Player p) throws InvalidPlayerException {

        if(playerOne.equals(p))
            return playerOneState;
        else if(playerTwo.equals(p))
            return playerTwoState;
        else
            throw new InvalidPlayerException();
    }

    protected GameState getStateAdversePlayer(Player p) throws InvalidPlayerException {

        if(playerOne.equals(p))
            return playerTwoState;
        else if(playerTwo.equals(p))
            return playerOneState;
        else
            throw new InvalidPlayerException();
    }

    protected void setStatePlayer(Player p, GameState gs) throws InvalidPlayerException {
        if(playerOne.equals(p))
            this.playerOneState = gs;
        else if(playerTwo.equals(p))
            this.playerTwoState = gs;
        else
            throw new InvalidPlayerException();
    }

    protected void setStateAdversePlayer(Player p, GameState gs) throws InvalidPlayerException {
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

    public abstract String getPoint(Player p) throws InvalidPlayerException;

}
