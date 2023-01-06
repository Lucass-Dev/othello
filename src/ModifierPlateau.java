public class ModifierPlateau {

    static int[][] directions = {{-1, -1},{0, -1 },{1, -1},{-1, 0},{1, 0},{-1, 1},{0, 1},{1, 1}};

    //Permet de créer le plateau de départ
    public static void createPlateau(int[][] plateau){

        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                plateau[i][j] = 0;
            }
        }
        plateau[3][3] = 1;
        plateau[3][4] = 2;
        plateau[4][3] = 2;
        plateau[4][4] = 1;
    }

    //Change la valeur de la cellule en fonction du joueur passé en paramètres
    public static void placerPion(int[][] plateau, int line, int col, int joueur){
        if (joueur == 1){
            plateau[line][col] = 1;
        }else if(joueur == 2){
            plateau[line][col] = 2;
        }
    }

    //Retourne true si on l'appel de reverse successif est supérieur à 0
    //Avec lineBase et colBase les coordonnées du pion posé
    //En plus de retourner les pions de la couleur alliée avec l'appel de la fonction reverse
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
                cpt+= reverse(plateau, lineBase + couple[0], colBase + couple[1], joueur, couple[1], couple[0] );
            }
        }

        if (plateau[lineBase][colBase] !=0){
            cpt = 0 ;
        }
        return cpt > 0;
    }

    //Retourne true si on l'appel de simuleReverse successif est supérieur à 0
    //Avec lineBase et colBase les coordonnées du pion posé
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

        if (plateau[lineBase][colBase] !=0){
            cpt = 0 ;
        }
        return cpt > 0;
    }

    //retourne le nombre de pion qu'un coup pourrait retourner d'un coup avec line et col les coordonnées du pion posé
    //X et Y le vecteur directeur
    //En plus de retourner les pions dans la couleur alliée
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
            line+= directionY;
            col+= directionX;
            cpt++;
        }
        return cpt;
    }


    //retourne le nombre de pion qu'un coup pourrait retourner d'un coup avec line et col les coordonnées du pion posé
    //X et Y le vecteur directeur
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

    //Retourne sous la forme d'un tableau à une dimension des coordonnées passées en paramètres (les coordonnées seront
    // forcément sous la bonne forme
    public static int[] switchStringToCoords(String coords){
        int[] coordsArray = new int[2];
        coordsArray[0] = coords.charAt(0)-65;
        coordsArray[1] = Integer.parseInt(String.valueOf(coords.charAt(1)))-1;
        return coordsArray;
    }


    // Retourne à L'ia le nombre de pions que retourne chaque coup possible
    public static int simuleCheckDirectionsIa(int[][] plateau, int lineBase, int colBase, int joueur){
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

        if (plateau[lineBase][colBase] !=0){
            cpt = 0 ;
        }
        return cpt;
    }
}