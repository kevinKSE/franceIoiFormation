package calculEtDecouverteDesVariables;

public class tableDeMultiplication {
    public static void main(String[] args) {

        //SOLUTION TROUVEE AVEC mon mentor
       /* int nbr = 1;
        for (int loop = 1; loop <= 20; loop = loop + 1) {
            for (int loop1=1; loop1 <= 20; loop1 = loop1 + 1) {
                nbr = loop*loop1;
                System.out.print(nbr + " ");
            }
            System.out.println();*/
//SOLUTION DE FRANCE IOI
            int ligne = 1;
            for (int loop1 = 1; loop1 <= 20; loop1 = loop1 + 1) {
                int colonne = 1;
                for (int loop2 = 1; loop2 <= 20; loop2 = loop2 + 1) {
                    System.out.print((colonne * ligne) + " ");
                    colonne = colonne + 1;
                }
                System.out.println();
                ligne = ligne + 1;

        }
    }
}


