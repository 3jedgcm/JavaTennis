package Game;

import Data.Player;
import State.SetGameState;
import Exception.*;
import State.TieBreakGameState;

import static State.TieBreakGameState.*;

public class TieBreakTennisGame extends TennisGame {

    public TieBreakTennisGame(Player p1, Player p2) {
        super(p1, p2);
        this.init();
    }

    @Override
    protected void init()
    {
        this.playerOneState = ONE;
        this.playerTwoState = ONE;
    }

    @Override
    public void addPoint(Player p) throws InvalidPlayerException, InvalidPlayerStateException {
        SetGameState currentState = this.getStatePlayer(p);
        SetGameState adverseState = this.getStateAdversePlayer(p);
        switch ((TieBreakGameState)currentState)
        {
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
                else
                this.setStatePlayer(p,SEVEN);
                break;
            case SEVEN:
                if(adverseState != SECURE)
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
}
