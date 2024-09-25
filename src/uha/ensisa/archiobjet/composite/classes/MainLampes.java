package uha.ensisa.archiobjet.composite.classes;

import uha.ensisa.archiobjet.visitor.ConsoleVisitor;
import uha.ensisa.archiobjet.visitor.VisitorITF;

public class MainLampes {
    public static void main(String[] args) {

        System.out.println("\n--------------\nObjets dessin 1\n--------------\n");
        Lampe l1 = new Lampe();
        l1.allumer();;

        VisitorITF v = new ConsoleVisitor();

        l1.accept(v);


        Circuit c1 = new Circuit();
        c1.ajouter(new Lampe(true));
        c1.ajouter(new Lampe());
        c1.ajouter(new Lampe(true));

        c1.accept(v);

        Circuit c2  = new Circuit();

        Circuit c3 = new Circuit();
        c3.ajouter(new Lampe());
        c3.ajouter(new Lampe());
        c3.ajouter(new Lampe(true));

        Circuit c4 = new Circuit();
        c4.ajouter(new Lampe());
        c4.ajouter(new Lampe());


        c2.ajouter(c3);
        c2.ajouter(new Lampe(true));
        c2.ajouter(c4);


        c2.accept(v);

        //c1.ajouter(c2); // attention récursion
        //c2.accept(v);

    }
}
