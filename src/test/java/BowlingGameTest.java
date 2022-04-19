import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {

    private  Game g;

    @BeforeEach
    void setUp() {
         g = new Game();
    }

    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++)
            g.roll(pins);
    }

    @Test
    public void testNewGame()  {
        assertNotNull(g);
    }

    @Test
    public void testGutterGame()  {
       int rolls = 20;
       int pins = 0;
       rollMany(rolls, pins);
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes()  {
        rollMany(20,1);
        assertEquals(20, g.score());
    }

    @Test
    public void testOneSpare() {
        g.roll(5);
        g.roll(5); // spare
        g.roll(3);
        rollMany(17,0);
        assertEquals(16,g.score());
    }

}

