package battleshipgame;
import battleshipgame.Move;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserGuessTest {
    
    
    
    
    
    @Test
    public void testGuessResultsHit() {
         // Arrange
    String[][][] adjBoard = new String[3][10][10];
    ArrayList<String> shipList = new ArrayList<>();
    ArrayList<Move> moveHist = new ArrayList<>();
    int x = 5;
    int y = 5;
    adjBoard[0][Main.gTOaY(y)][Main.gTOaX(x)] = "X"; // Assuming it's a hit
    
    // Act
    int result = UserGuess.guessResults(adjBoard, shipList, moveHist, x, y);
    
    // Assert
    assertEquals(2, result);
    }
    
    @Test
    public void testGuessResultsMiss() {
        // Arrange
        String[][][] adjBoard = new String[3][10][10];
        ArrayList<String> shipList = new ArrayList<>();
        ArrayList<Move> moveHist = new ArrayList<>();
        int x = 5;
        int y = 5;
        adjBoard[0][y][x] = null; // Assuming it's a miss
        
        // Act
        int result = UserGuess.guessResults(adjBoard, shipList, moveHist, x, y);
        
        // Assert
        assertEquals(0, result);
    }
}
