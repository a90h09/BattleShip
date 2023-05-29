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

      import org.junit.Test;
import static org.junit.Assert.*;

public class CompInputShipsTest {

    @Test
    public void testAutoFill() {
        String[][][] grid = new String[1][10][10];
        CompInputShips.autoFill(grid);

        // Verify that all ships are properly placed on the grid
        assertEquals(5, countShips(grid, "a"));
        assertEquals(4, countShips(grid, "b"));
        assertEquals(3, countShips(grid, "c"));
        assertEquals(3, countShips(grid, "s"));
        assertEquals(2, countShips(grid, "d"));
    }
    
   
    @Test
    public void testGridSize() {
        String[][][] grid = new String[1][10][10];
        CompInputShips.autoFill(grid);

        // Verify that the grid size is 10x10
        assertEquals(10, grid[0].length);
        assertEquals(10, grid[0][0].length);
    }

    private int countShips(String[][][] grid, String shipChar) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (grid[0][i][j] != null && grid[0][i][j].equals(shipChar)) {
                    count++;
                }
            }
        }
        return count;
    }
    
    
}
      

