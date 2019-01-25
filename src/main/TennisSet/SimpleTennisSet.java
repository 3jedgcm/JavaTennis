package TennisSet;
import Data.Player;
import State.SetState;
import State.SimpleGameState;
import State.SimpleSetState;
import TennisGame.*;
import Exception.*;
import static State.SimpleSetState.*;


public class SimpleTennisSet extends TennisSet {

    private int playerOnePoint;
    private int playerTwoPoint;

    public SimpleTennisSet(Player p1, Player p2) {
        super(p1, p2);
        this.init(p1,p2);
    }

    @Override
    protected void init(Player p1, Player p2) {
            this.game = new SimpleTennisGame(p1,p2);
            this.playerOneSetState = ZERO;
            this.playerTwoSetState = ZERO;
            this.playerOnePoint = 0;
            this.playerTwoPoint = 0;
    }

    @Override
    public void addPoint(Player p) throws InvalidPlayerStateException, InvalidPlayerException {
        {
            this.game.addPoint(p);
            if(this.game.isWin(p))
            {
                this.incrementPoint(p);
                SetState currentState = this.getStatePlayer(p);
                SetState adverseState = this.getStateAdversePlayer(p);
                this.game = new SimpleTennisGame(this.playerOne,this.playerTwo);
                switch ((SimpleSetState)currentState)
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
                        if(adverseState == SIX)
                        {
                            this.setStateAdversePlayer(p,EQUALS);
                            this.setStatePlayer(p,EQUALS);
                        }
                        else if(adverseState == FIVE)
                            this.setStatePlayer(p,SIX);
                        else
                            this.setStatePlayer(p,WIN);
                        break;

                    case SIX:
                        if(adverseState == FIVE)
                        {
                            this.setStatePlayer(p,WIN);
                        }
                        else if(adverseState == SECURE)
                        {
                            this.setStateAdversePlayer(p,EQUALS);
                            this.setStatePlayer(p,EQUALS);
                        }
                        break;
                    case EQUALS:
                        this.setStatePlayer(p,SECURE);
                        this.setStateAdversePlayer(p,SIX);
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
    }

    private void incrementPoint(Player p)
    {
        if(playerOne.equals(p))
            this.playerOnePoint++;
        else if(playerTwo.equals(p))
            this.playerTwoPoint++;
    }

    @Override
    public String getSetPoint(Player p) throws InvalidPlayerException {
        if(playerOne.equals(p))
            return this.playerOnePoint +"";
        else if(playerTwo.equals(p))
            return this.playerTwoPoint +"";
        else
            throw new InvalidPlayerException();
    }

    @Override
    public String getGamePoint(Player p) throws InvalidPlayerException {
        return this.game.getPoint(p);
    }

}
