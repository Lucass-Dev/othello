public class ModifierPlateau {

    static int[][] directions = {{-1, -1},{-1, 0},{-1, 1},{0, -1},{0, 1},{1, -1},{1, 0},{1, 1}};

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

    public static boolean checkDirections(int[][] plateau, int lineBase, int colBase, int joueur){
        int adversaire, cpt =0, line, col;

        if (joueur == 1){
            adversaire=2;
        }else if(joueur == 2){
            adversaire=1;
        }else{
            adversaire = 0;
        }

        for(int[] couple: directions){
            line = lineBase + couple[0];
            col = colBase + couple[1];
            while (( line <= 7 && line >= 0) && (col <= 7 && col >= 0) && plateau[line][col] == adversaire ){
                line+= couple[0];
                col+= couple[1];
            }

            if (( line <= 7 && line >= 0) && (col <= 7 && col >= 0) && plateau[line][col] == joueur){
                cpt+= reverse(plateau, lineBase + couple[0], colBase + couple[1], joueur, couple[0], couple[1] );
            }
        }
        return cpt > 0;
    }

    public static int reverse(int[][] plateau, int line, int col, int joueur, int directionX, int directionY){
        int adversaire, cpt = 0;

        if (joueur == 1){
            adversaire=2;
        }else if(joueur == 2){
            adversaire=1;
        }else{
            adversaire = 0;
        }

        while (plateau[line][col] == adversaire){
            plateau[line][col] = joueur;
            line+= directionX;
            col+= directionY;
            cpt++;
        }
        return cpt;
    }


    public static boolean simuleCheckDirections(int[][] plateau, int lineBase, int colBase, int joueur){
        int adversaire, cpt =0, line, col;

        if (joueur == 1){
            adversaire=2;
        }else if(joueur == 2){
            adversaire=1;
        }else{
            adversaire = 0;
        }

        for(int[] couple: directions){
            line = lineBase + couple[0];
            col = colBase + couple[1];
            while (( line <= 7 && line >= 0) && (col <= 7 && col >= 0) && plateau[line][col] == adversaire){
                line+= couple[0];
                col+= couple[1];
            }

            if (( line <= 7 && line >= 0) && (col <= 7 && col >= 0) && plateau[line][col] == joueur){
                cpt+= simuleReverse(plateau, lineBase + couple[0], colBase + couple[1], joueur, couple[0], couple[1] );
            }
        }
        return cpt > 0;
    }
    public static int simuleReverse(int[][] plateau, int line, int col, int joueur, int directionX, int directionY){
        int adversaire, cpt = 0;

        if (joueur == 1){
            adversaire=2;
        }else if(joueur == 2){
            adversaire=1;
        }else{
            adversaire = 0;
        }

        while (plateau[line][col] == adversaire){
            line+= directionX;
            col+= directionY;
            cpt++;
        }
        return cpt;
    }

    public static int[] switchStringToCoords(String coords){
        int[] coordsArray = new int[2];
        coordsArray[0] = coords.charAt(0)-65;
        coordsArray[1] = Integer.parseInt(String.valueOf(coords.charAt(1)))-1;
        return coordsArray;
    }
}
//rond blanc ⚪ o j1
// rond noir ⚫ x j2