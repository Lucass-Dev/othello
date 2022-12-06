public class Main {
    public static void main(String[] args) {
        Interface.printMenuPrincipal();

        int[][] plateau = new int[8][8];
        ModifierPlateau.createPlateau(plateau);
        System.out.println("test");

    }
}

//rond blanc ⚪
// rond noir ⚫