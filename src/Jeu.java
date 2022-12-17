public class Jeu {
    public static void boucleDeJeu(int[][] plateau, int joueur){
        while (true){
            /*
            peutJouer1 = true;
            peutJouer2 = true;
            if ( !peutPoser(plateau, 1) && !peutPoser(plateau, 2)){
                //lanceer methode fin de jeu
            } else if (!peutPoser(plateau, 1) && peutPoser(plateau, 2)) {
                peutJouer1=false;
            } else if (peutPoser(plateau, 1) && !peutPoser(plateau, 2)) {
                peutJouer2 = false;
            }else{
                Menu.printMenuIngame(plateau, joueur, peutJouer);
            }
             */
            boolean peutJouer = true;
            if ( !peutPoser(plateau, 1) && !peutPoser(plateau, 2)){
                finDeJeu();
            }

            if (joueur==1) {
                if (!peutPoser(plateau, 1)) {
                    peutJouer = false;
                }
            }

            if (joueur==2) {
               if (!peutPoser(plateau, 2)) {
                    peutJouer = false;
                }
            }

            Menu.printMenuIngame(plateau, joueur, peutJouer);

            if (joueur == 1){
                joueur = 2;
            }else{
                joueur = 1;
            }
        }
    }

    public static boolean peutPoser(int[][] plateau, int joueur){
        int coupsJouables = 0;

        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                if (plateau[i][j]==0){
                    if (ModifierPlateau.simuleCheckDirections(plateau,i, j, joueur)){
                        coupsJouables++;
                    }
                }
            }
        }

        return coupsJouables > 0;
    }

    public static void finDeJeu(){
        System.out.println("Bravo à vous le jeu jeu est finit !");
    }
}
