public class Main {
    public static void main(String[] args) {
        int[][] plateau = new int[8][8];
        ModifierPlateau.createPlateau(plateau);
        Affichage.printPlateau(plateau);
    }
}

//rond blanc ⚪
// rond noir ⚫