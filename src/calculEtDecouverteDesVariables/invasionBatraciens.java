package calculEtDecouverteDesVariables;

public class invasionBatraciens {
    public static void main(String[] args) {
        int nbCrapauds =1337;
        for (int loop = 1; loop <= 12; loop = loop+1) {
            nbCrapauds=  nbCrapauds*2;
        }
        System.out.println( "le nb de crapauds a la semaine 12 est de : " + nbCrapauds);
    }
}
