package calculEtDecouverteDesVariables;

public class decollageDeFusee {
        public static void main(String[] args) {
            int decompte = 100;
            for (int loop = 1; loop <=101; loop = loop + 1) {
                System.out.println(decompte);
                decompte = decompte -1;
            }
            System.out.println("Décollage ! ");
        }

}
