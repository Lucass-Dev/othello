public class ModifierPlateau {

    public static void createPlateau(String[][] plateau){

        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                plateau[i][j] = " ";
            }
        }
        char letter = 'A';
        for (int i = 1; i < plateau.length-1; i++) {
            plateau[i][0] = String.valueOf(i);
            plateau[0][i] = String.valueOf(letter);
            plateau[plateau.length-1][i] = String.valueOf(letter);
            plateau[i][plateau.length-1] = String.valueOf(i);
            letter++;
        }
    }
}
