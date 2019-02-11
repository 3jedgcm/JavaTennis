package SetTest;

import Data.Player;
import Exception.*;
import State.*;
import TennisSet.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TieBreakTennisSetTest {

    private Player p1 = new Player("Coralie");
    private Player p2 = new Player("Johana");


    @Test
    public void TiebreakTennisGameTest() throws Exception {

        TennisSet tennisGame = new TieBreakTennisSet(this.p1,this.p2);

        assertEquals(TieBreakSetGame.ZERO.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);

        assertEquals(TieBreakSetGame.ONE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);


        assertEquals(TieBreakSetGame.TWO.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);


        assertEquals(TieBreakSetGame.THREE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);


        assertEquals(TieBreakSetGame.FOUR.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);

        assertEquals(TieBreakSetGame.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        assertEquals(false,tennisGame.isWin(this.p1));
        assertEquals(false,tennisGame.isWin(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);

        assertEquals(true,tennisGame.isWin(this.p1));
        assertEquals(false,tennisGame.isWin(this.p2));

    }


    @Test
    public void TiebreakTennisGameLongTest() throws Exception {

        TennisSet tennisGame = new TieBreakTennisSet(this.p1,this.p2);

        assertEquals(TieBreakSetGame.ZERO.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);

        assertEquals(TieBreakSetGame.ONE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);


        assertEquals(TieBreakSetGame.TWO.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);


        assertEquals(TieBreakSetGame.THREE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);


        assertEquals(TieBreakSetGame.FOUR.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);

        assertEquals(TieBreakSetGame.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        assertEquals(false,tennisGame.isWin(this.p1));
        assertEquals(false,tennisGame.isWin(this.p2));

        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);

        assertEquals(TieBreakSetGame.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.ONE.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);

        assertEquals(TieBreakSetGame.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.TWO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);

        assertEquals(TieBreakSetGame.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.THREE.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);

        assertEquals(TieBreakSetGame.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.FOUR.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);

        assertEquals(TieBreakSetGame.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.FIVE.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);

        assertEquals(TieBreakSetGame.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.SIX.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);

        assertEquals(TieBreakSetGame.TIE_BREAK.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(TieBreakSetGame.TIE_BREAK.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);

        assertEquals(true,tennisGame.isWin(this.p1));
        assertEquals(false,tennisGame.isWin(this.p2));


    }

    @Test(expected = IsAlreadyWinException.class)
    public void TieBreakTennisGameIsAlreadyWinException() throws InvalidPlayerException, IsAlreadyWinException, InvalidPlayerStateException {
        TennisSet tennisGame = new TieBreakTennisSet(this.p1,this.p2);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);

        tennisGame.addPoint(this.p1);

    }

    @Test(expected = InvalidPlayerException.class)
    public void TieBreakTennisGameInvalidPlayerException() throws InvalidPlayerException, IsAlreadyWinException, InvalidPlayerStateException {
        TennisSet tennisGame = new TieBreakTennisSet(this.p1,this.p2);
        tennisGame.addPoint(new Player("Matin"));
    }
}
