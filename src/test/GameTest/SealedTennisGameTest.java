package GameTest;

import Data.Player;
import Exception.*;
import State.*;
import TennisGame.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SealedTennisGameTest {

    private Player p1 = new Player("Coralie");
    private Player p2 = new Player("Johana");


    @Test
    public void sealedTennisGameTest() throws Exception {

        TennisGame tennisGame = new SealedTennisGame(this.p1,this.p2);

        assertEquals("0",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p1);

        assertEquals("1",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p1);

        assertEquals("2",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p1);

        assertEquals("3",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p1);

        assertEquals("4",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p1);

        assertEquals("5",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p1);

        assertEquals("6",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p1);

        assertEquals("7",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        assertEquals(tennisGame.isWin(this.p1),true);
        assertEquals(tennisGame.isWin(this.p2),false);

    }


    @Test
    public void sealedTennisGameLongTest() throws Exception {

        TennisGame tennisGame = new SealedTennisGame(this.p1,this.p2);

        assertEquals("0",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p1);

        assertEquals("1",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p1);

        assertEquals("2",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p1);

        assertEquals("3",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p1);

        assertEquals("4",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p1);

        assertEquals("5",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p1);

        assertEquals("6",tennisGame.getPoint(this.p1));
        assertEquals("0",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p2);

        assertEquals("6",tennisGame.getPoint(this.p1));
        assertEquals("1",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p2);

        assertEquals("6",tennisGame.getPoint(this.p1));
        assertEquals("2",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p2);

        assertEquals("6",tennisGame.getPoint(this.p1));
        assertEquals("3",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p2);

        assertEquals("6",tennisGame.getPoint(this.p1));
        assertEquals("4",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p2);

        assertEquals("6",tennisGame.getPoint(this.p1));
        assertEquals("5",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p2);

        assertEquals("6",tennisGame.getPoint(this.p1));
        assertEquals("6",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p2);

        assertEquals("6",tennisGame.getPoint(this.p1));
        assertEquals("7",tennisGame.getPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p2);

        assertEquals("7",tennisGame.getPoint(this.p1));
        assertEquals("8",tennisGame.getPoint(this.p2));

        assertEquals(tennisGame.isWin(this.p1),false);
        assertEquals(tennisGame.isWin(this.p2),false);

        tennisGame.addPoint(this.p2);

        assertEquals("7",tennisGame.getPoint(this.p1));
        assertEquals("9",tennisGame.getPoint(this.p2));

        assertEquals(tennisGame.isWin(this.p1),false);
        assertEquals(tennisGame.isWin(this.p2),true);


    }


    @Test(expected = IsAlreadyWinException.class)
    public void sealedTennisGameIsAlreadyWinException() throws InvalidPlayerException, IsAlreadyWinException, InvalidPlayerStateException {
        TennisGame tennisGame = new SealedTennisGame(this.p1,this.p2);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p1);
        tennisGame.addPoint(p2);
    }

    @Test(expected = InvalidPlayerException.class)
    public void sealedTennisGameInvalidPlayerException() throws InvalidPlayerException, IsAlreadyWinException, InvalidPlayerStateException {
        TennisGame tennisGame = new SealedTennisGame(this.p1,this.p2);
        tennisGame.addPoint(new Player("martin"));
    }
}
