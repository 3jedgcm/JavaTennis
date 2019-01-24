package TennisSet;
import Data.Player;
import State.SetState;
import State.SimpleGameState;
import State.SimpleSetState;
import State.TieBreakSetGame;
import TennisGame.*;
import Exception.*;
import static State.TieBreakSetGame.*;


public class TieBreakTennisSet extends TennisSet {

    public TieBreakTennisSet(Player p1, Player p2) {
        super(p1, p2);
        this.init(p1,p2);
    }

    @Override
    protected void init(Player p1, Player p2) {
        this.game = new SimpleTennisGame(p1,p2);
        this.playerOneSetState = ZERO;
        this.playerTwoSetState = ZERO;
    }

    @Override
    public void addPoint(Player p) throws InvalidPlayerStateException, InvalidPlayerException {
        {
            this.game.addPoint(p);
            boolean b = this.game.isWin(p);
            if(b)
            {
                SetState currentState = this.getStatePlayer(p);
                this.game = new SimpleTennisGame(this.playerOne,this.playerTwo);
                switch ((TieBreakSetGame)currentState)
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
                        if(this.getStateAdversePlayer(p) == SIX)
                        {
                            this.game = new SealedTennisGame(this.playerOne,this.playerTwo);
                            this.setStatePlayer(p,TIE_BREAK);
                            this.setStateAdversePlayer(p,TIE_BREAK);
                        }
                        else if(this.getStateAdversePlayer(p) == FIVE)
                            this.setStatePlayer(p,SIX);
                        else
                            this.setStatePlayer(p,WIN);
                        break;
                    case SIX:
                        this.setStatePlayer(p,WIN);
                        break;
                    case TIE_BREAK:
                        this.setStatePlayer(p,WIN);
                        break;
                    case WIN:
                        break;
                    default:
                        throw new InvalidPlayerStateException();
                }
            }
        }
    }

    @Override
    public String getPoint(Player p) throws InvalidPlayerException {
        return this.getStatePlayer(p).toString();
    }

}
