/*
// mon programme qui fonctionne parfaitement sur  France IOI
package lectureDeLentree;

import java.util.Scanner;

public class graduationDeThermomètres {
    static Scanner entree = new Scanner(System.in);

    public static void main(String[] args) {
        int tempMin = entree.nextInt();
        int tempMax = entree.nextInt();
        for (int loop = tempMin; loop <= tempMax; loop = loop + 1) {

            System.out.println(loop);
        }
    }
}
*/


//solution proposée par France IOI
package lectureDeLentree;

import java.util.Scanner;

public class graduationDeThermomètres {

    static Scanner entree = new Scanner(System.in);

    public static void main(String[] args) {
        int tempMin = entree.nextInt();
        int tempMax = entree.nextInt();
        int temperature = tempMin;
        for (int loop = 1; loop <= tempMax - tempMin + 1; loop = loop + 1) {
            System.out.println(temperature);
            temperature = temperature + 1;
        }
    }
}