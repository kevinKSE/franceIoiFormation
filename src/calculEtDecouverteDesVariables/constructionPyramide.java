package calculEtDecouverteDesVariables;

public class constructionPyramide {
    public static void main(String[] args) {
        int nbCube = 0;

        for (int loop = 1; loop <= 17; loop = loop + 2) {
            nbCube=nbCube+(loop*loop*loop);

        }
        System.out.println(nbCube);

    }
}
