public class Ia {

    public static int iaAvancee(int[][] plateau, int joueur){

        int lineMeilleurCoup=-1 , colMeilleurCoup=-1, cptmeilleur = 0 ;

            // Parcours du plateau en cherchant quel coup retourne le plus de pions:
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                 if (ModifierPlateau.simuleCheckDirectionsIa(plateau,i,j,joueur) > cptmeilleur){
                     cptmeilleur =ModifierPlateau.simuleCheckDirectionsIa(plateau,i,j,joueur);
                     lineMeilleurCoup = i;
                     colMeilleurCoup =j;
                 }
            }
        }

        System.out.println(" Ah ! Mon tour, 2 secondes.. \n");

        if (cptmeilleur == 0 || lineMeilleurCoup == -1 || (colMeilleurCoup == -1) ){
            System.out.println(" ... \n ...\n \nJe ne peux pas jouer, Je passe mon tour");

        }
        else{

            ModifierPlateau.checkDirections(plateau,lineMeilleurCoup,colMeilleurCoup,joueur);
            ModifierPlateau.placerPion(plateau,lineMeilleurCoup,colMeilleurCoup,joueur);
            Affichage.printPlateau(plateau);
            Jeu.comptagePion(plateau);

            System.out.println("Et voila, à vous");
        }


    return cptmeilleur;

    }

}
