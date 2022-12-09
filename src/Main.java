public class Main {
    public static void main(String[] args) {
        //Interface.printMenuPrincipal();
        //Interface.printMenuIngame();
        //Joueur.demanderCoords();
        int[][] plateau = new int[8][8];
        ModifierPlateau.createPlateau(plateau);
        Affichage.printPlateau(plateau);
        ModifierPlateau.placerPion(plateau, ModifierPlateau.switchStringToCoords("F5")[1], ModifierPlateau.switchStringToCoords("F5")[0], 2);
        Affichage.printPlateau(plateau);
    }
}

//rond blanc ⚪
// rond noir ⚫