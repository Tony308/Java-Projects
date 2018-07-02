import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBlackJack {

    @Test
    public void testBlackJack() {
        BlackJack main = new BlackJack();
        assertEquals(21, main.blackJack(21,18));
        assertEquals(0, main.blackJack(22, 15));
    }
}
