package lectureDeLentree;

import java.util.Scanner;

public class ageDesPetitsEnfants {
    static Scanner entree = new Scanner(System.in);

    public static void main(String[] args) {
        int ageCadet = entree.nextInt();
        int ageAine= entree.nextInt();
        int difference = ageAine - ageCadet;
        System.out.println(difference);
    }
}
