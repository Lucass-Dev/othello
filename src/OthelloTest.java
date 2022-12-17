import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class OthelloTest {

    @Test
    public final void peutPoser(){
        int[][] configPlusDePionPosable= {
            {1, 0, 2, 2, 2, 2, 2, 2},
            {1, 1, 2, 2, 2, 2, 2, 2},
            {1, 1, 1, 1, 2, 2, 2, 2},
            {1, 1, 2, 1, 2, 2, 2, 2},
            {1, 1, 1, 2, 1, 2, 2, 2},
            {1, 1, 2, 1, 2, 1, 2, 2},
            {1, 1, 2, 2, 1, 2, 1, 2},
            {1, 1, 1, 1, 1, 1, 1, 1}
        };
        assertTrue(Jeu.peutPoser(configPlusDePionPosable, 1));
        assertFalse(Jeu.peutPoser(configPlusDePionPosable, 2));
    }
}
