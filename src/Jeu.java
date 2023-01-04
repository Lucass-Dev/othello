public class Jeu {
    public static void boucleDeJeu(int[][] plateau, int joueur){
        Affichage.printPlateau(plateau);
        comptagePion(plateau);
        boolean finDeJeu = false;
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
                finDeJeu(plateau);
                break;
            }else if (joueur==1) {
                if (!peutPoser(plateau, 1)) {
                    peutJouer = false;
                }
            }else if (joueur==2) {
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

    public static void finDeJeu(int[][] plateau){
        System.out.println("Bravo à vous le jeu est fini !" +
                "\nVoici l'état du plateau");
        Affichage.printPlateau(plateau);
        System.out.println("Le gagnant est le joueur");
    }

    public static void comptagePion(int[][] plateau){
        int compteurBlanc = 0, compteurNoir = 0;
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                if (plateau[i][j] == 1){
                    compteurBlanc++;
                }else if (plateau[i][j] == 2){
                    compteurNoir++;
                }
            }
        }
        System.out.println("Blancs :" + compteurBlanc +
                "\nNoirs : " + compteurNoir);
    }
}
