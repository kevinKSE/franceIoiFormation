package calculEtDecouverteDesVariables;
import static algorea.Robot.*;
public class courseAvecLesEnfants {

        public static void main(String[] args) {
            int anneau =1;
            for (int loop = 1; loop <= 10; loop = loop+1) {
                droite();
                ramasser();
                gauche();
                deposer();
                droite();
                anneau = anneau + 1 ;
            }
        }
}
