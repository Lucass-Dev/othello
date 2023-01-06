import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    //Gère le menu qui apparait à chaque tour de boucle du jeu
    public static void printMenuIngame(int[][] plateau, int joueur, boolean peutJouer) throws FileNotFoundException {

        int choixJoueur;
        char couleur;
        if (joueur==1){
            couleur = '⬛';
        }else{
            couleur = '⬜';
        }



        do {
            System.out.println("Vous êtes le joueur "+ couleur +
                    " que voulez-vous faire ?" +
                    "\n\t-1 : Jouer" +
                    "\n\t-2 : Passer son tour" +
                    "\n\t-3 : Relire les règles"+
                    "\n\t-4 : Abandonner");

            choixJoueur = sc.nextInt();

            if (choixJoueur >4 || choixJoueur<1){
                System.out.println("Erreur de saisie !!!!");
            }

            if ((choixJoueur==1 && !peutJouer)){
                System.out.println("Vous ne pouvez pas jouer pour l'instant, passez votre tour ou abandonnez");
            }

        }while(choixJoueur >4 || choixJoueur<1 || (choixJoueur==1 && !peutJouer));

        Affichage.printPlateau(plateau);
        switch (choixJoueur){
            case 1:
                    Jeu.comptagePion(plateau);
                    int[] coordsArray;
                    coordsArray = ModifierPlateau.switchStringToCoords(Joueur.demanderCoords());
                    while (!ModifierPlateau.checkDirections(plateau, coordsArray[1], coordsArray[0], joueur)){
                        System.out.println("Erreur, mouvement non règlementaire, pensez à relire les règles.");
                        coordsArray = ModifierPlateau.switchStringToCoords(Joueur.demanderCoords());
                    }
                    ModifierPlateau.placerPion(plateau, coordsArray[1], coordsArray[0], joueur);
                    Affichage.printPlateau(plateau);
                break;
            case 2 :
                System.out.println("Vous passez votre tour.");
                break;

            case 3 :
                Rules.lireRegles();
                break;

            case 4 :
                System.out.println("ok loser ");
                Jeu.abandon(joueur);

                break;
            default:
                break;
        }
    }
    //Gère le menu de début de partie
    public static void printMenuPrincipal() throws FileNotFoundException {

        int choixJoueur;

        do {

            System.out.println("Bienvenue dans Othello, que souhaitez-vous faire ?" +
                    "\n\t-1 : Jouer contre un Joueur" +
                    "\n\t-2 : Jouer contre l'IA (facile)" +
                    "\n\t-3 : Jouer contre l'IA (difficile)" +
                    "\n\t-4 : Lire les règles"+
                    "\n\t-5 : Quitter");

             choixJoueur = sc.nextInt();

            if (choixJoueur > 5 || choixJoueur < 1)
                System.out.println("Erreur de saisie !");

        }while(choixJoueur > 5 || choixJoueur < 1);

        switch (choixJoueur){
            case 1:
                int[][] plateau = new int[8][8];
                ModifierPlateau.createPlateau(plateau);
                Jeu.boucleDeJeu(plateau, 2);
                break;
            case 2:
                break;
            case 4:
                Rules.lireRegles();
                break;
            case 5:
                System.out.println("Au revoir !");
                System.exit(0);
                break;
            default:
                break;
        }
    }
}