import java.util.Scanner;

public class Joueur {
    static Scanner sc = new Scanner(System.in);

    public static void demanderCoords(){
        System.out.println("Où voulez vous placer votre pion ?");
        String coords = sc.nextLine();
        while (coords.length()!=2 || coords.charAt(0) < 65 || coords.charAt(0) > 72 || Integer.parseInt(String.valueOf(coords.charAt(1))) < 1 || Integer.parseInt(String.valueOf(coords.charAt(1))) > 5){
            System.out.println();
            System.out.println("Erreur de saisie, les coodronés doivent être sous la forme : (A-H)(1-8)");
            System.out.println("Où voulez vous placer votre pion ?");
            coords = sc.nextLine();
        }
    }
}
