package TennisGame;

import Data.Player;
import State.GameState;
import Exception.*;
import State.SealedGameState;

import static State.SealedGameState.*;

public class SealedTennisGame extends TennisGame {

    private int playerOnePoint;
    private int playerTwoPoint;

    public SealedTennisGame(Player p1, Player p2) {
        super(p1, p2);
        this.init();
    }

    @Override
    protected void init()
    {
        this.playerOneState = ZERO;
        this.playerTwoState = ZERO;
        this.playerOnePoint = 0;
        this.playerTwoPoint = 0;
    }

    @Override
    public void addPoint(Player p) throws InvalidPlayerException, InvalidPlayerStateException {
        GameState currentState = this.getStatePlayer(p);
        GameState adverseState = this.getStateAdversePlayer(p);
        this.incrementPoint(p);
        switch ((SealedGameState)currentState)
        {
            case ZERO:
                this.setStatePlayer(p,ONE);
                break;
            case ONE:
                this.setStatePlayer(p,TWO);
                break;
            case TWO:
                this.setStatePlayer(p,THREE);
                break;
            case THREE:
                this.setStatePlayer(p,FOUR);
                break;
            case FOUR:
                this.setStatePlayer(p,FIVE);
                break;
            case FIVE:
                this.setStatePlayer(p,SIX);
                break;
            case SIX:
                if(adverseState == SEVEN)
                {
                    this.setStatePlayer(p,EQUALS);
                    this.setStateAdversePlayer(p,EQUALS);
                }
                else if(adverseState == SIX)
                {
                    this.setStatePlayer(p,SEVEN);
                }
                else
                this.setStatePlayer(p,WIN);
                break;
            case SEVEN:
                if(adverseState == SIX)
                {
                    this.setStatePlayer(p,WIN);
                }
                else
                {
                    this.setStatePlayer(p,EQUALS);
                    this.setStateAdversePlayer(p,EQUALS);
                }
                break;
            case EQUALS:
                this.setStatePlayer(p,SECURE);
                this.setStateAdversePlayer(p,SEVEN);
                break;
            case SECURE:
                this.setStatePlayer(p,WIN);
                break;
            case WIN:
                break;
            default:
                throw new InvalidPlayerStateException();
        }
    }

    private void incrementPoint(Player p)
    {
        if(playerOne.equals(p))
            this.playerOnePoint++;
        else if(playerTwo.equals(p))
            this.playerTwoPoint++;
    }

    @Override
    public String getPoint(Player p) throws InvalidPlayerException {
        if(playerOne.equals(p))
            return this.playerOnePoint +"";
        else if(playerTwo.equals(p))
            return this.playerTwoPoint +"";
        else
            throw new InvalidPlayerException();
    }
}
