package com.huang.test.models;

import com.huang.models.Board;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBoard {
    Board board;

    @Before
    public void setup() {
        board = new Board();
    }

    @After
    public void tearDown() {

    }


    @Test
    public void testBoardPopulation() {

        board.populateDefaultBoard();
        String[][] expected = new String[3][3];

        for (int x = 0; x < 3;x++) {
            for (int z = 0; z < 3;z++){
                expected[x][z] = " ~ ";
            }
        }
        assertEquals(expected, board);
    }
}
