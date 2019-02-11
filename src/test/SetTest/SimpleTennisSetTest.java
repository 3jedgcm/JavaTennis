package SetTest;
import Data.Player;
import Exception.*;
import State.*;
import TennisSet.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTennisSetTest {

    private Player p1 = new Player("Coralie");
    private Player p2 = new Player("Johana");


    @Test
    public void simpleTennisGameTest() throws Exception {

        TennisSet tennisGame = new SimpleTennisSet(this.p1,this.p2);

        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);

        assertEquals(SimpleSetState.ONE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);


        assertEquals(SimpleSetState.TWO.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);


        assertEquals(SimpleSetState.THREE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);


        assertEquals(SimpleSetState.FOUR.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);

        assertEquals(SimpleSetState.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        assertEquals(false,tennisGame.isWin(this.p1));
        assertEquals(false,tennisGame.isWin(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);

        assertEquals(true,tennisGame.isWin(this.p1));
        assertEquals(false,tennisGame.isWin(this.p2));

        assertEquals(SimpleSetState.SIX.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p2));

    }

    @Test
    public void simpleTennisGameLongTest() throws Exception {

        TennisSet tennisGame = new SimpleTennisSet(this.p1,this.p2);

        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);

        assertEquals(SimpleSetState.ONE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);


        assertEquals(SimpleSetState.TWO.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);


        assertEquals(SimpleSetState.THREE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);


        assertEquals(SimpleSetState.FOUR.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);
        tennisGame.addPoint(this.p1);

        assertEquals(SimpleSetState.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.ZERO.toString(),tennisGame.getSetPoint(this.p2));


        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);

        assertEquals(SimpleSetState.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.ONE.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);

        assertEquals(SimpleSetState.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.TWO.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);

        assertEquals(SimpleSetState.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.THREE.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);

        assertEquals(SimpleSetState.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.FOUR.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);

        assertEquals(SimpleSetState.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.FIVE.toString(),tennisGame.getSetPoint(this.p2));

        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);


        assertEquals(SimpleSetState.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.SIX.toString(),tennisGame.getSetPoint(this.p2));

        assertEquals(false,tennisGame.isWin(this.p1));
        assertEquals(false,tennisGame.isWin(this.p2));

        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);
        tennisGame.addPoint(this.p2);

        assertEquals(SimpleSetState.FIVE.toString(),tennisGame.getSetPoint(this.p1));
        assertEquals(SimpleSetState.SEVEN.toString(),tennisGame.getSetPoint(this.p2));

        assertEquals(false,tennisGame.isWin(this.p1));
        assertEquals(true,tennisGame.isWin(this.p2));


    }

    @Test(expected = IsAlreadyWinException.class)
    public void simpleTennisGameIsAlreadyWinException() throws InvalidPlayerException, IsAlreadyWinException, InvalidPlayerStateException {
        TennisSet tennisGame = new SimpleTennisSet(this.p1,this.p2);
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
    public void simpleTennisGameInvalidPlayerException() throws InvalidPlayerException, IsAlreadyWinException, InvalidPlayerStateException {
        TennisSet tennisGame = new SimpleTennisSet(this.p1,this.p2);
        tennisGame.addPoint(new Player("Matin"));
    }
}
