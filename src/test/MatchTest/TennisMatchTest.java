package MatchTest;

import Data.Player;
import Exception.InvalidPlayerException;
import Exception.InvalidPlayerStateException;
import Exception.IsAlreadyWinException;
import State.MatchType;
import State.TieBreakMatchState;
import TennisMatch.TennisMatch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisMatchTest {

    private Player p1 = new Player("Coralie");
    private Player p2 = new Player("Johana");

    @Test
    public void simpleTennisMatchWithoutTieBreakTest() throws Exception {

        TennisMatch tennisMatch = new TennisMatch(this.p1,this.p2, MatchType.BEST_OF_THREE,TieBreakMatchState.WITHOUT_TIE_BREAK.getState());
        assertEquals("0",tennisMatch.getMatchPoint(this.p1));
        assertEquals("0",tennisMatch.getMatchPoint(this.p2));
        assertEquals(1,tennisMatch.currentSetNumber());
        assertEquals(0,tennisMatch.gamesInSetForPlayer(1,this.p1));



        tennisMatch.updateWithPointWonBy(this.p1);
        assertEquals("15",tennisMatch.pointsForPlayer(this.p1));
        tennisMatch.updateWithPointWonBy(this.p1);
        assertEquals("30",tennisMatch.pointsForPlayer(this.p1));
        tennisMatch.updateWithPointWonBy(this.p1);
        assertEquals("40",tennisMatch.pointsForPlayer(this.p1));
        tennisMatch.updateWithPointWonBy(this.p1);

        assertEquals(0,tennisMatch.gamesInSetForPlayer(1,this.p1));
        assertEquals(1,tennisMatch.gamesInCurrentSetForPlayer(this.p1));




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
        assertEquals(0,tennisMatch.gamesInSetForPlayer(1,this.p1));

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
        assertEquals(3,tennisMatch.currentSetNumber());
        assertEquals(true,tennisMatch.isFinished());
        assertEquals(0,tennisMatch.gamesInSetForPlayer(1,this.p1));
    }

    @Test
    public void simpleTennisMatchWithoutTieBreakLongTest() throws Exception {

        TennisMatch tennisMatch = new TennisMatch(this.p1,this.p2, MatchType.BEST_OF_FIVE,TieBreakMatchState.WITHOUT_TIE_BREAK.getState());
        assertEquals("0",tennisMatch.getMatchPoint(this.p1));
        assertEquals("0",tennisMatch.getMatchPoint(this.p2));
        assertEquals(1,tennisMatch.currentSetNumber());

        tennisMatch.updateWithPointWonBy(this.p1);
        assertEquals("15",tennisMatch.pointsForPlayer(this.p1));
        tennisMatch.updateWithPointWonBy(this.p1);
        assertEquals("30",tennisMatch.pointsForPlayer(this.p1));
        tennisMatch.updateWithPointWonBy(this.p1);
        assertEquals("40",tennisMatch.pointsForPlayer(this.p1));
        tennisMatch.updateWithPointWonBy(this.p1);

        assertEquals(1,tennisMatch.gamesInCurrentSetForPlayer(this.p1));

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
        assertEquals(2,tennisMatch.currentSetNumber());

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
        assertEquals(3,tennisMatch.currentSetNumber());
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);

        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);

        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);

        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);

        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);

        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);

        assertEquals("2",tennisMatch.getMatchPoint(this.p1));
        assertEquals("1",tennisMatch.getMatchPoint(this.p2));
        assertEquals(4,tennisMatch.currentSetNumber());
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

        assertEquals("3",tennisMatch.getMatchPoint(this.p1));
        assertEquals("1",tennisMatch.getMatchPoint(this.p2));
        assertEquals(5,tennisMatch.currentSetNumber());
        assertEquals(true,tennisMatch.isFinished());

    }

    @Test
    public void simpleTennisMatchWithTieBreakTest() throws Exception {

        TennisMatch tennisMatch = new TennisMatch(this.p1,this.p2, MatchType.BEST_OF_THREE,TieBreakMatchState.WITH_TIE_BREAK.getState());
        assertEquals("0",tennisMatch.getMatchPoint(this.p1));
        assertEquals("0",tennisMatch.getMatchPoint(this.p2));
        assertEquals(1,tennisMatch.currentSetNumber());

        tennisMatch.updateWithPointWonBy(this.p1);
        assertEquals("15",tennisMatch.pointsForPlayer(this.p1));
        tennisMatch.updateWithPointWonBy(this.p1);
        assertEquals("30",tennisMatch.pointsForPlayer(this.p1));
        tennisMatch.updateWithPointWonBy(this.p1);
        assertEquals("40",tennisMatch.pointsForPlayer(this.p1));
        tennisMatch.updateWithPointWonBy(this.p1);

        assertEquals(1,tennisMatch.gamesInCurrentSetForPlayer(this.p1));

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
        assertEquals(2,tennisMatch.currentSetNumber());
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
        assertEquals(3,tennisMatch.currentSetNumber());
        assertEquals(true,tennisMatch.isFinished());

    }

    @Test
    public void simpleTennisMatchWithTieBreakLongTest() throws Exception {

        TennisMatch tennisMatch = new TennisMatch(this.p1,this.p2, MatchType.BEST_OF_FIVE,TieBreakMatchState.WITH_TIE_BREAK.getState());
        assertEquals("0",tennisMatch.getMatchPoint(this.p1));
        assertEquals("0",tennisMatch.getMatchPoint(this.p2));
        assertEquals(1,tennisMatch.currentSetNumber());

        tennisMatch.updateWithPointWonBy(this.p1);
        assertEquals("15",tennisMatch.pointsForPlayer(this.p1));
        tennisMatch.updateWithPointWonBy(this.p1);
        assertEquals("30",tennisMatch.pointsForPlayer(this.p1));
        tennisMatch.updateWithPointWonBy(this.p1);
        assertEquals("40",tennisMatch.pointsForPlayer(this.p1));
        tennisMatch.updateWithPointWonBy(this.p1);

        assertEquals(1,tennisMatch.gamesInCurrentSetForPlayer(this.p1));

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
        assertEquals(3,tennisMatch.currentSetNumber());
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);

        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);

        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);

        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);

        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);

        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);
        tennisMatch.updateWithPointWonBy(this.p2);

        assertEquals("2",tennisMatch.getMatchPoint(this.p1));
        assertEquals("1",tennisMatch.getMatchPoint(this.p2));
        assertEquals(4,tennisMatch.currentSetNumber());
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

        assertEquals("3",tennisMatch.getMatchPoint(this.p1));
        assertEquals("1",tennisMatch.getMatchPoint(this.p2));
        assertEquals(5,tennisMatch.currentSetNumber());
        assertEquals(true,tennisMatch.isFinished());

    }

    @Test(expected = IsAlreadyWinException.class)
    public void simpleTennisGameIsAlreadyWinException() throws InvalidPlayerException, IsAlreadyWinException, InvalidPlayerStateException {
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

        assertEquals(true,tennisMatch.isFinished());
        tennisMatch.updateWithPointWonBy(this.p1);

    }

    @Test(expected = InvalidPlayerException.class)
    public void simpleTennisGameInvalidPlayerException() throws InvalidPlayerException, IsAlreadyWinException, InvalidPlayerStateException {
        TennisMatch tennisMatch = new TennisMatch(this.p1,this.p2, MatchType.BEST_OF_THREE,TieBreakMatchState.WITHOUT_TIE_BREAK.getState());
        tennisMatch.updateWithPointWonBy(new Player("Martin"));
    }

}
