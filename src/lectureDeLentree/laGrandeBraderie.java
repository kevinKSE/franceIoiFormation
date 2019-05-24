package lectureDeLentree;

import java.util.Scanner;

public class laGrandeBraderie {

    static Scanner entree = new Scanner(System.in);

    public static void main (String[] args){
        int positionDepart = entree.nextInt();
        int largeurEmplacement = entree.nextInt();
        int nbVendeurs = entree.nextInt();
        int resultat =positionDepart;
        System.out.println(resultat);
        for (int loop =0; loop<nbVendeurs;  loop=loop+1) {

            resultat = resultat+ largeurEmplacement;


            System.out.println(resultat);
        }
    }
}
