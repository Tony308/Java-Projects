import static org.junit.Assert.*;
import org.junit.Test;


public class TestUniqueSum {

    @Test
    public void testUniqueSum(){
        UniqueSum main = new UniqueSum();
        assertEquals(6, main.uniqueSum(1,2,3));
        assertEquals(0, main.uniqueSum(1,1,1));
        assertEquals(2, main.uniqueSum(1,2,1));
        assertEquals(2, main.uniqueSum(2,1,1));
    }


}

