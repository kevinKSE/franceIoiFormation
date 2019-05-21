// ma solution qui fonctionne sur FranceIOI

package lectureDeLentree;

import java.util.Scanner;


public class JeuDeCalculMental {

    static Scanner Clavier = new Scanner(System.in);

    public static void main(String[] args) {
        int nbNombre = Clavier.nextInt();
        int resultat = 66;
        int facteur = 1;
        for (int loop = 1; loop <= nbNombre; loop = loop + 1) {
            resultat = resultat * facteur;
            System.out.println(resultat);
            facteur = facteur + 1;
        }
    }
}


// correction FEANCE IOI
/*
package lectureDeLentree;
import java.util.Scanner;
class Main {
    static Scanner entree = new Scanner(System.in);

    public static void main(String[] args) {
        int nbNombres = entree.nextInt();
        int resultat = 66;
        for (int facteur = 1; facteur <= nbNombres; facteur = facteur + 1) {
            resultat = resultat * facteur;
            System.out.println(resultat);
        }
    }
}
*/