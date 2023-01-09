public class Affichage {

    //Affiche de manière stylisé les valeur du plateau
    public static void printPlateau(int[][] plateau){

        char letter = 'A';
        for (int i = 0; i < plateau.length; i++) {
            System.out.print("\t"+letter);
            letter++;
        }

        System.out.println();
        for (int i = 0; i < plateau.length; i++) {
            System.out.print(i+1 +" |");
            for (int j = 0; j < plateau.length; j++) {
                switch (plateau[i][j]){
                    case 0:
                        System.out.print("   |");
                        break;
                    case 1:
                        System.out.print(" B |"); //⬛
                        break;
                    case 2:
                        System.out.print(" N |"); // ⬜
                        break;
                    default:
                        System.out.print("err");
                        break;
                }
            }
            System.out.print(" " + (i+1));
            System.out.println();
        }
        letter = 'A';
        for (int i = 0; i < plateau.length; i++) {
            System.out.print("\t"+letter);
            letter++;
        }
        System.out.println();

    }
}

