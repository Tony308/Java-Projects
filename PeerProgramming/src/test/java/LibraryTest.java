import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {



    @Test
    public void testStringCheck() {

        StringManipulation check = new StringManipulation();
        check.checkString();
        assertEquals("Deepisodes of Deep Space Nine came on the televisionly after the news." , check.checkString());

    }



}
