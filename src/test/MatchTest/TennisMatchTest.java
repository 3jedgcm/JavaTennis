package GameTest;

import Data.Player;
import Exception.InvalidPlayerException;
import Exception.InvalidPlayerStateException;
import Exception.IsAlreadyWinException;
import State.MatchType;
import State.SimpleGameState;
import State.TieBreakMatchState;
import TennisGame.SimpleTennisGame;
import TennisGame.TennisGame;
import TennisMatch.TennisMatch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisMatchTest {

    private Player p1 = new Player("Coralie");
    private Player p2 = new Player("Johana");


    @Test
    public void simpleTennisGameTest() throws Exception {

        TennisMatch tennisMatch = new TennisMatch(this.p1,this.p2, MatchType.BEST_OF_THREE,TieBreakMatchState.WITHOUT_TIE_BREAK.getState());
        assertEquals("0",tennisMatch.getMatchPoint(this.p1));
        assertEquals("0",tennisMatch.getMatchPoint(this.p2));

        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);

        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);

        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);

        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);

        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);

        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);

        assertEquals("1",tennisMatch.getMatchPoint(this.p1));
        assertEquals("0",tennisMatch.getMatchPoint(this.p2));

        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);

        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);

        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);

        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);

        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);

        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);
        tennisMatch.updateWithPointWonBy(this.p1);

        assertEquals("2",tennisMatch.getMatchPoint(this.p1));
        assertEquals("0",tennisMatch.getMatchPoint(this.p2));

        assertEquals(true,tennisMatch.isFinished());




    }












    @Test(expected = InvalidPlayerStateException.class)
    public void simpleTennisGameInvalidPlayerStateException() throws InvalidPlayerException, IsAlreadyWinException, InvalidPlayerStateException {
        TennisGame tennisGame = new SimpleTennisGame(this.p1,this.p2);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p1);
    }

    @Test(expected = IsAlreadyWinException.class)
    public void simpleTennisGameIsAlreadyWinException() throws InvalidPlayerException, IsAlreadyWinException, InvalidPlayerStateException {
        TennisGame tennisGame = new SimpleTennisGame(this.p1,this.p2);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p2);
    }

    @Test(expected = InvalidPlayerException.class)
    public void simpleTennisGameInvalidPlayerException() throws InvalidPlayerException, IsAlreadyWinException, InvalidPlayerStateException {
        TennisGame tennisGame = new SimpleTennisGame(this.p1,this.p2);
        tennisGame.addPoint(new Player("martin"));
    }


}
