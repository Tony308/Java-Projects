import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)

public class TestUniqueSum {

    private int expected, input1, input2, input3;

    TestUniqueSum(int expected, int input1, int input2, int input3) {
        this.expected = expected;
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }

    @Parameters
    public static List<Integer[]> data() {
        return Arrays.asList(new Integer[][] {{6,1,2,3}, {0, 1,1,1}, {2, 1,2,1}, {2,2,1,1}});
    }

    @Test
    public void uniqueSumTest(){
        UniqueSum main = new UniqueSum();
        assertEquals(6, main.uniqueSum(1,2,3));
        assertEquals(0, main.uniqueSum(1,1,1));
        assertEquals(2, main.uniqueSum(1,2,1));
        assertEquals(2, main.uniqueSum(2,1,1));
    }

    @Test
    public void UniqueSumParametizedTest() {
        UniqueSum main = new UniqueSum();
        assertEquals(expected, main.uniqueSum(input1,input2, input3));
    }

}

