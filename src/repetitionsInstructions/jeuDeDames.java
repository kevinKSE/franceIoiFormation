package repetitionsInstructions;

public class jeuDeDames {
    public static void main(String[] args) {

        for (int loop1 = 1; loop1 <= 20; loop1 = loop1 + 1) {
            for (int loop2 = 1; loop2 <= 20; loop2 = loop2 + 1) {
                System.out.print("OX");
            }
            System.out.println();
            for (int loop3 = 1; loop3 <= 20; loop3 = loop3 + 1) {
                System.out.print("XO");
            }
            System.out.println();
        }
    }
}
