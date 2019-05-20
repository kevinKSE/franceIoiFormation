/*
// ma solution qui fonctionne parfaitement sur France IOI
package lectureDeLentree;

import java.util.Scanner;

public class encoreDesPunitions {

   static Scanner entree = new Scanner(System.in);

    public static void main(String[] args) {
        int nbLignes =entree.nextInt();
        for (int loop=1; loop<=nbLignes; loop=loop+1) {

            System.out.println("Je dois suivre en cours");
        }
        nbLignes=nbLignes+1;

    }
}
*/

// SOLUTION FRANCE-IOI
package lectureDeLentree;

import java.util.Scanner;
 public class encoreDesPunitions{
    static Scanner entree = new Scanner(System.in);
    public static void main(String[] args) {
        int nbLignes = entree.nextInt();
        for (int iLigne = 1; iLigne <= nbLignes; iLigne = iLigne + 1) {
            System.out.println("Je dois suivre en cours");
        }
    }
}

