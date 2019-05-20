package lectureDeLentree;

import java.util.Scanner;

public class retraiteSpirituelle {

    static Scanner entree = new Scanner(System.in);

    public static void main(String[] args) {
        int nbJours = entree.nextInt();

        System.out.println(nbJours * 3600 * 16);
    }
}
