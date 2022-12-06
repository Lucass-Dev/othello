public class ModifierPlateau {

    public static void createPlateau(int[][] plateau){

        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                plateau[i][j] = 0;
            }
        }

        plateau[3][3] = 2;
        plateau[3][4] = 1;
        plateau[4][3] = 1;
        plateau[4][4] = 2;
    }

    public static void placerPion(int[][] plateau, int line, int col, int joueur){
        if (joueur == 1){
            plateau[line][col] = 1;
        }else if(joueur == 2){
            plateau[line][col] = 2;
        }
    }
}
//rond blanc ⚪ j1
// rond noir ⚫ j2