import static org.junit.Assert.assertEquals;


public class Test {

    @org.junit.Test
    public void testStringCheck() {

        StringManipulation check = new StringManipulation();
        check.checkString();
        assertEquals("Deepisodes of Deep Space Nine came on the televisionly after the news." , check.checkString());

    }
}
