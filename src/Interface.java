import java.util.Scanner;

public class Interface {
    static final Scanner sc = new Scanner(System.in);

    public static void printMenuIngame(){
        System.out.println("Que voulez-vous faire ?" +
                "\n\t-1 : Jouer" +
                "\n\t-2 : Passer son tour" +
                "\n\t-3 : Relire les règles");
        int choixJoueur = sc.nextInt();
    }
}
