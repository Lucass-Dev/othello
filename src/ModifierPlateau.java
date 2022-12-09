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

    public static boolean peutPoser(int[][] plateau, int line ,int col, int joueur) {

        if (line == 0 && col == 0) {  // coin up left

            for (int i = col; i < col + 2; i++) {
                if (plateau[line + 1][i] == joueur) //Cas ou col =0, ligne inférieure
                    return false;
            }
            if (plateau[line][col + 1] == joueur) // cas ou col =0 , ligne médiane
                return false;
        } else if (line == 0 && col == 7) {  // coin up right
            for (int i = col - 1; i < col + 1; i++) {
                if (plateau[line + 1][i] == joueur) // Cas où col =7, ligne inférieure
                    return false;
            }
            if (plateau[line][col - 1] == joueur) // cas où col =7 , ligne médiane
                return false;

        } else if (line == 0) {  // bordure haute

            for (int i = col - 1; i < col + 2; i++) {
                if (plateau[line + 1][i] == joueur) // Cas où line =0 col !=0, ligne inférieure
                    return false;
            }
            for (int i = col - 1; i < col + 2; i += 2) {
                if (plateau[line][i] == joueur)// cas où line =0 col !=0, ligne médiane
                    return false;
            }

        } else if (line == 7 && col == 0) { //coin down left
            for (int i = col; i < col + 2; i++) {
                if (plateau[line - 1][i] == joueur) //Cas ou col =0, ligne supérieure
                    return false;
            }
            if (plateau[line][col + 1] == joueur) // cas ou col =0 , ligne médiane
                return false;
        } else if (line == 7 && col == 7) { //coin down right
            for (int i = col - 1; i < col + 1; i++) {
                if (plateau[line - 1][i] == joueur) // Cas où col =7, ligne supérieure
                    return false;
            }
            if (plateau[line][col - 1] == joueur) // cas où col =7 , ligne médiane
                return false;
        } else if (line == 7) { //bordure basse
            for (int i = col - 1; i < col + 2; i++) {
                if (plateau[line - 1][i] == joueur) // Cas où line =7 col !=0 et 7, ligne supérieure
                    return false;
            }
            for (int i = col - 1; i < col + 2; i += 2) {
                if (plateau[line][i] == joueur)// cas où line =7 col !=0 et 7, ligne médiane
                    return false;
            }
        } else if (col == 0) { //bordure gauche
            for (int i = col; i < col + 2; i++) {
                if (plateau[line - 1][i] == joueur) //Cas ou col =0, ligne supérieure
                    return false;
            }
            if (plateau[line][col + 1] == joueur) // cas ou col =0 , ligne médiane
                return true;
            for (int i = col; i < col + 2; i++) {
                if (plateau[line + 1][i] == joueur) //Cas ou col =0, ligne inférieure
                    return false;
            }
        } else if (col == 7) { //bordure droite
            for (int i = col - 1; i < col + 1; i++) {
                if (plateau[line - 1][i] == joueur) //Cas ou col =7, ligne supérieure
                    return false;
            }
            if (plateau[line][col - 1] == joueur) // cas ou col =7 , ligne médiane
                return true;
            for (int i = col; i < col + 2; i++) {
                if (plateau[line + 1][i] == joueur) //Cas ou col =7, ligne inférieure
                    return false;
            }
        } else if (line < 7 && line > 0 && col < 7 && col > 0) {  // ni coin ni bordure
            for (int i = col - 1; i < col + 2; i++) {
                if (plateau[line - 1][i] == joueur) //Cas ou col =0, ligne supérieure
                    return false;
            }
            for (int i = col - 1; i < col + 2; i += 2) {
                if (plateau[line][i] == joueur)// cas où line =0 col !=0, ligne médiane
                    return false;
            }

            for (int i = col - 1; i < col + 2; i++) {
                if (plateau[line + 1][i] == joueur) //Cas ou col =0, ligne inférieure
                    return false;

            }
        }

        return true;
    }

    public static int[] switchStringToCoords(String coords){
        int[] coordsArray = new int[2];
        coordsArray[0] = coords.charAt(0)-65;
        coordsArray[1] = Integer.parseInt(String.valueOf(coords.charAt(1)))-1;
        return coordsArray;
    }
}
//rond blanc ⚪ j1
// rond noir ⚫ j2