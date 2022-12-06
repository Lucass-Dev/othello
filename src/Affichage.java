public class Affichage {
    public static void printPlateau(String[][] plateau){
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                System.out.print(plateau[i][j]);
                if (i==0 || i == 9){
                    System.out.print("\t");
                }
                if (j< plateau.length-1 && i!= 0 && i!=9){
                    System.out.print(" | ");
                }

            }
            System.out.println();
        }
    }
}
