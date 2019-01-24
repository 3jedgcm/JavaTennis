package TennisGame;

import Data.Player;
import State.*;
import Exception.*;
import static State.SimpleGameState.*;

public class SimpleTennisGame extends TennisGame {

    public SimpleTennisGame(Player p1, Player p2) {
        super(p1, p2);
        this.init();
    }

    @Override
    protected void init()
    {
        this.playerOneState = LOVE;
        this.playerTwoState = LOVE;
    }

    @Override
    public void addPoint(Player p) throws InvalidPlayerException, InvalidPlayerStateException {
        GameState currentState = this.getStatePlayer(p);
        GameState adverseState = this.getStateAdversePlayer(p);
        switch ((SimpleGameState)currentState)
        {
            case LOVE:
                this.setStatePlayer(p,FIFTEEN);
                break;
            case FIFTEEN:
                this.setStatePlayer(p,THIRTY);
                break;
            case THIRTY:
                this.setStatePlayer(p,FORTY);
                break;
            case FORTY:
                if(adverseState == FORTY)
                    this.setStatePlayer(p, ADVANTAGE);
                else if(adverseState == ADVANTAGE)
                    this.setStateAdversePlayer(p,FORTY);
                else
                    this.setStatePlayer(p,WIN);
                break;
            case ADVANTAGE:
                this.setStatePlayer(p,WIN);
                break;
            default:
                throw new InvalidPlayerStateException();
        }
    }

    @Override
    public String getPoint(Player p) throws InvalidPlayerException {
        return this.getStatePlayer(p).toString();
    }

}
