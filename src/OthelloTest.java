import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class OthelloTest {

    @Test
    public final void peutPoser(){
        int[][] configPlusDePionPosable= {
            {1, 0, 2, 2, 2, 2, 2, 2},
            {1, 1, 2, 2, 2, 2, 2, 2},
            {1, 1, 1, 2, 2, 2, 2, 2},
            {1, 1, 2, 1, 2, 2, 2, 2},
            {1, 1, 1, 2, 1, 2, 2, 2},
            {1, 1, 2, 1, 2, 1, 2, 2},
            {1, 1, 2, 2, 1, 2, 1, 2},
            {1, 1, 1, 1, 1, 1, 1, 1}
        };
        assertFalse(Jeu.peutPoser(configPlusDePionPosable, 1));
        assertFalse(Jeu.peutPoser(configPlusDePionPosable, 2));


        int[][] configPionPosable1= {
                {1, 0, 2, 2, 2, 2, 2, 2},
                {1, 1, 2, 2, 2, 2, 2, 2},
                {1, 1, 1, 1, 2, 2, 2, 2},
                {1, 1, 2, 1, 2, 2, 2, 2},
                {1, 1, 1, 2, 1, 2, 2, 2},
                {1, 1, 2, 1, 2, 1, 2, 2},
                {1, 1, 2, 2, 1, 2, 1, 2},
                {1, 1, 1, 1, 1, 1, 1, 1}
        };
        assertTrue(Jeu.peutPoser(configPionPosable1, 1));
        assertFalse(Jeu.peutPoser(configPionPosable1, 2));


        int[][] configPionPosable2= {
                {1, 0, 2, 2, 2, 2, 2, 2},
                {1, 1, 2, 2, 2, 2, 2, 2},
                {1, 2, 1, 2, 2, 2, 2, 2},
                {1, 1, 2, 1, 2, 2, 2, 2},
                {1, 1, 1, 2, 1, 2, 2, 2},
                {1, 1, 2, 1, 2, 1, 2, 2},
                {1, 1, 2, 2, 1, 2, 1, 2},
                {1, 1, 1, 1, 1, 1, 1, 1}
        };
        assertFalse(Jeu.peutPoser(configPionPosable2, 1));
        assertTrue(Jeu.peutPoser(configPionPosable2, 2));

        int[][] configPionPosableTous= {
                {1, 2, 2, 2, 2, 2, 2, 0},
                {1, 1, 2, 2, 2, 2, 2, 2},
                {1, 1, 1, 1, 2, 2, 2, 2},
                {1, 1, 2, 1, 2, 2, 2, 2},
                {1, 1, 1, 2, 1, 2, 2, 2},
                {1, 1, 2, 1, 2, 1, 2, 2},
                {1, 1, 2, 2, 1, 2, 1, 2},
                {1, 0, 1, 1, 1, 1, 1, 1}
        };
        assertTrue(Jeu.peutPoser(configPionPosableTous, 1));
        assertTrue(Jeu.peutPoser(configPionPosableTous, 2));
    }

    @Test
    public final void checkDirections(){
        int[][] uneDirection= {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 2, 0, 0, 0},
                {0, 0, 0, 2, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertTrue(ModifierPlateau.checkDirections(uneDirection,2,3,2));
        int[][] uneDirection2= {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 2, 0, 0, 0},
                {0, 0, 0, 2, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertTrue(ModifierPlateau.checkDirections(uneDirection2,2,4,1));

        int[][] uneDirection3= {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 2, 0, 0, 0},
                {0, 0, 0, 2, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertFalse(ModifierPlateau.checkDirections(uneDirection3,4,5,1));

        int[][] uneDirection4= {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 2, 0, 0, 0},
                {0, 0, 0, 2, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertFalse(ModifierPlateau.checkDirections(uneDirection4,3,5,2));


        int[][] toutesDirections= {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 2, 2, 2, 1, 0, 0},
                {0, 1, 2, 0, 2, 1, 0, 0},
                {0, 1, 2, 2, 2, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        int[][] toutesDirectionsAttendu= {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        ModifierPlateau.checkDirections(toutesDirections,3,3,1);
        ModifierPlateau.placerPion(toutesDirections,3,3,1);
        assertArrayEquals(toutesDirectionsAttendu,toutesDirections);

    }

    @Test
    public final void reverse(){
        int[][] reverseDiagonale= {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 2, 2, 0, 0, 0},
                {0, 0, 0, 2, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertEquals(1,ModifierPlateau.reverse(reverseDiagonale,2,2,1,1,1),"retourne un pion ");

    }




}
