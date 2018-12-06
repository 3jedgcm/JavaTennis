import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest
{
    TennisMatch tennis;
    Player playerOne = new Player("Martin");
    Player playerTwo = new Player("Annabelle");


    @Before
    public void setUp()
    {
        this.tennis = new TennisMatch(playerOne,playerTwo,MatchType.BEST_OF_THREE,true);
    }


    @Test
    public void test()
    {
        assertEquals(tennis.isFinished(), false);
        assertEquals(tennis.pointsForPlayer(playerOne),"0");
    }


    @After
    public void finish()
    {

    }


}
