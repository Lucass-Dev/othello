import java.io.FileNotFoundException;

public class Jeu {

    //Méthode qui gère la boucle de jeu principale
    public static void boucleDeJeu(int[][] plateau, int joueur) throws FileNotFoundException {
        Affichage.printPlateau(plateau);
        comptagePion(plateau);
        while (true){
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
    public static void boucleDeJeuIA(int[][] plateau, int joueur) throws FileNotFoundException {
        Affichage.printPlateau(plateau);
        comptagePion(plateau);
        //boolean finDeJeu = false;
        while (true){

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


            if (joueur == 2){
                joueur = 1;
            }

            if (joueur==1){
                Ia.iaAvancee(plateau,1);
                joueur=2;
            }
        }
    }



    //Vérifie sur tout le plateau si au moins un coup est jouable pour le joueur dont c'est le tour
    //Renvoie true si on peut poser au moins un pion sur le plateau (vérifie sur chaque case)
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

    //Gère la fin du jeu
    public static void finDeJeu(int[][] plateau){
        System.out.println("Bravo à vous le jeu est fini !" +
                "\nVoici l'état du plateau");
        Affichage.printPlateau(plateau);
        comptagePion(plateau);

        System.out.print("Le gagnant est le joueur ");


        int compteurBlanc = 0, compteurNoir = 0;

        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                if (plateau[i][j] == 2){
                    compteurNoir++;
                }else if (plateau[i][j] == 1){
                    compteurBlanc++;
                }
            }
        }
        if (compteurBlanc>compteurNoir)
            System.out.println("Blanc !");
        else
            System.out.println("Noir !");

    }

    //Print le compte des pions de chaque joueur
    public static void comptagePion(int[][] plateau){
        int compteurBlanc = 0, compteurNoir = 0;
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                if (plateau[i][j] == 2){
                    compteurNoir++;
                }else if (plateau[i][j] == 1){
                    compteurBlanc++;
                }
            }
        }
        System.out.println("Blancs :" + compteurBlanc +
                "\nNoirs : " + compteurNoir + "\n \n ");
    }

    //Gère l'abandon
    public static void abandon(int joueur){

        int vainqueur;

        if (joueur==1){
            System.out.println(" Joueur B abandone, Joueur N gagne ! ");
        }
        else {
            System.out.println(" Joueur N abandone, Joueur B gagne ! ");
        }
        System.exit(0);

    }
}
