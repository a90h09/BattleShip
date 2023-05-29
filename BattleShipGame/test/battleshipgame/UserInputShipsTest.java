/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshipgame;

/**
 *
 * @author Ahmed
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserInputShipsTest {

    @Test
    public void testShipDirection() {
        String input = "UP"; // Provide input for the test
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in); // Set the input stream

        String[][][] grid = new String[2][10][10];
        int x = 5;
        int y = 5;
        String direction = UserInputShips.shipDirection("5, 4, 3, 3, 2", "first", 5, grid, x, y);
        assertNotNull(direction);
        assertTrue(direction.matches("(UP|DOWN|LEFT|RIGHT)"));
    }

    @Test
    public void testGetCoord() {
         String input = "1"; // Provide input for the test
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in); // Set the input stream

        String[][][] grid = new String[2][10][10];
        int coord = UserInputShips.getCoord("5, 4, 3, 3, 2", "first", 5, grid);
        assertEquals(1, coord);
    }

    

}

