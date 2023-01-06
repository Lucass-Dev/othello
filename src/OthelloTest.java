import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class OthelloTest {

    @Test
    public final void peutPoserTest(){
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
        System.out.println("Test peutPoser aucun pion posable: passé");

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
        System.out.println("Test peutPoser pion posable joueur 1: passé");


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
        System.out.println("Test peutPoser pion posable joueur 2: passé");


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
        System.out.println("Test peutPoser pion posable joueur 1 & 2: passé \n");


    }

    @Test
    public final void checkDirectionsTest(){
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
        System.out.println("Test checkDirections direction droite: passé");

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
        System.out.println("Test checkDirections direction verticale joueur 1: passé");


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
        System.out.println("Test checkDirections mouvement non réglementaire vertical: passé");


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
        System.out.println("Test checkDirections mouvement non réglementaire horinzontal: passé");


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
        System.out.println("Test checkDirections test check toutes les directions: passé");



        int[][] checkCoin= {
                {0, 0, 0, 0, 0, 1, 2, 0},
                {0, 0, 0, 0, 0, 0, 2, 2},
                {0, 0, 0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertTrue(ModifierPlateau.checkDirections(checkCoin,0,7,1));
        System.out.println("Test checkDirection coin: passé \n");

    }

    @Test
    public final void reverseTest(){
        int[][] reverseDroite= {
                {0, 1, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 2, 2, 0, 0, 0},
                {0, 1, 2, 1, 1, 2, 1, 0},
                {0, 2, 2, 0, 0, 1, 0, 0},
                {0, 2, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0}
        };


       // Affichage.printPlateau(reverseHorizontal);

        assertEquals(1,ModifierPlateau.reverse(reverseDroite,4,2,1,1,0),"retourne vers la droite ");
        System.out.println("Test reverse retourne un pion: passé");
       // Affichage.printPlateau(reverseHorizontal);


        int[][] reverseHaut= {
                {0, 1, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 2, 2, 0, 0, 0},
                {0, 1, 2, 1, 1, 2, 1, 0},
                {0, 2, 2, 0, 0, 1, 0, 0},
                {0, 2, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0}
        };


        // Affichage.printPlateau(reverseHorizontal);

        assertEquals(3,ModifierPlateau.reverse(reverseHaut,3,1,1,0,-1),"retourne des pions vers le haut ");
        System.out.println("Test reverse retourne vers le haut: passé");

        int[][] reverseBas= {
                {0, 1, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 2, 2, 0, 0, 0},
                {0, 1, 2, 1, 1, 2, 1, 0},
                {0, 2, 2, 0, 0, 1, 0, 0},
                {0, 2, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0}
        };


        // Affichage.printPlateau(reverseHorizontal);

        assertEquals(2,ModifierPlateau.reverse(reverseBas,5,1,1,0,1),"retourne des pions vers le bas ");
        System.out.println("Test reverse retourne vers le Bas: passé");

        int[][] reverseGauche= {
                {0, 1, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 1, 0, 0, 0},
                {0, 2, 0, 2, 0, 0, 0, 0},
                {0, 2, 2, 2, 2, 0, 0, 0},
                {0, 1, 2, 1, 1, 2, 1, 0},
                {0, 2, 2, 0, 0, 1, 0, 0},
                {0, 2, 1, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0}
        };


        // Affichage.printPlateau(reverseHorizontal);

        assertEquals(1,ModifierPlateau.reverse(reverseGauche,4,5,1,-1,0),"retourne des pions vers la gauche ");
        System.out.println("Test reverse retourne vers la gauche: passé");

        int[][] reverseRien= {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 2, 2, 0, 0, 0},
                {0, 0, 0, 2, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 2, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertEquals(0,ModifierPlateau.reverse(reverseRien,4,3,2,1,0),"ne retourne rien  ");
        System.out.println("Test reverse ne retourne aucun pion: passé");
        //Affichage.printPlateau(reverseRien);

    }

    @Test
    public final void IaTest(){

        int[][] configMeilleur3= {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 2, 2, 0, 0, 0},
                {0, 1, 2, 0, 1, 2, 1, 0},
                {0, 2, 2, 0, 0, 1, 0, 0},
                {0, 2, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        assertEquals(3,Ia.iaAvancee(configMeilleur3,1));
        System.out.println();


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
        assertEquals(0,ModifierPlateau.simuleCheckDirectionsIa(configPlusDePionPosable,0,1,1));
        assertEquals(0,Ia.iaAvancee(configPlusDePionPosable,1));

    }

}
