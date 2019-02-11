package GameTest;

import Data.Player;
import Exception.*;
import State.*;
import TennisGame.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTennisGameTest {

    private Player p1 = new Player("Coralie");
    private Player p2 = new Player("Johana");


    @Test
    public void simpleTennisGameTest() throws Exception {

        TennisGame tennisGame = new SimpleTennisGame(this.p1,this.p2);

        assertEquals(SimpleGameState.LOVE.toString(),tennisGame.getPoint(this.p1));
        assertEquals(SimpleGameState.LOVE.toString(),tennisGame.getPoint(this.p2));

        tennisGame.addPoint(p1);

        assertEquals(SimpleGameState.FIFTEEN.toString(),tennisGame.getPoint(this.p1));
        assertEquals(SimpleGameState.LOVE.toString(),tennisGame.getPoint(this.p2));

        tennisGame.addPoint(p2);

        assertEquals(SimpleGameState.FIFTEEN.toString(),tennisGame.getPoint(this.p1));
        assertEquals(SimpleGameState.FIFTEEN.toString(),tennisGame.getPoint(this.p2));

        tennisGame.addPoint(p1);
        tennisGame.addPoint(p2);

        assertEquals(SimpleGameState.THIRTY.toString(),tennisGame.getPoint(this.p1));
        assertEquals(SimpleGameState.THIRTY.toString(),tennisGame.getPoint(this.p2));

        tennisGame.addPoint(p1);
        tennisGame.addPoint(p2);

        assertEquals(SimpleGameState.FORTY.toString(),tennisGame.getPoint(this.p1));
        assertEquals(SimpleGameState.FORTY.toString(),tennisGame.getPoint(this.p2));

        tennisGame.addPoint(p1);

        assertEquals(SimpleGameState.ADVANTAGE.toString(),tennisGame.getPoint(this.p1));
        assertEquals(SimpleGameState.FORTY.toString(),tennisGame.getPoint(this.p2));

        tennisGame.addPoint(p2);

        assertEquals(SimpleGameState.FORTY.toString(),tennisGame.getPoint(this.p1));
        assertEquals(SimpleGameState.FORTY.toString(),tennisGame.getPoint(this.p2));

        tennisGame.addPoint(p2);

        assertEquals(SimpleGameState.FORTY.toString(),tennisGame.getPoint(this.p1));
        assertEquals(SimpleGameState.ADVANTAGE.toString(),tennisGame.getPoint(this.p2));

        tennisGame.addPoint(p2);

        assertEquals(SimpleGameState.FORTY.toString(),tennisGame.getPoint(this.p1));
        assertEquals(SimpleGameState.WIN.toString(),tennisGame.getPoint(this.p2));

        assertEquals(false,tennisGame.isWin(p1));
        assertEquals(true,tennisGame.isWin(p2));

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
