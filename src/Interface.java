import java.util.Scanner;

public class Interface {

    static Scanner sc = new Scanner(System.in);



    public static void printMenuIngame(){

        int choixJoueur;

        do {
            System.out.println("Que voulez-vous faire ?" +
                    "\n\t-1 : Jouer" +
                    "\n\t-2 : Passer son tour" +
                    "\n\t-3 : Relire les règles"+
                    "\n\t-4 : Abandonner");

            choixJoueur = sc.nextInt();

            System.out.println("Erreur de saisie !");

        }while(choixJoueur >4 || choixJoueur<1);
    }

    public static void printMenuPrincipal(){

        int choixJoueur;

        do {

            System.out.println("Bienvenue dans Othello, que souhaitez-vous faire ?" +
                    "\n\t-1 : Jouer contre un Joueur" +
                    "\n\t-2 : Jouer contre l'IA (facile)" +
                    "\n\t-3 : Jouer contre l'IA (difficile Insh'Allah)" +
                    "\n\t-4 : Lire les règles"+
                    "\n\t-5 : Quitter");

             choixJoueur = sc.nextInt();

            if (choixJoueur > 5 || choixJoueur < 1)
                System.out.println("Erreur de saisie !");

        }while(choixJoueur > 5 || choixJoueur < 1);




        switch (choixJoueur){
            case 5:
                System.out.println("Au revoir !");
                System.exit(0);
                break;
            default:
                break;
        }
    }
}