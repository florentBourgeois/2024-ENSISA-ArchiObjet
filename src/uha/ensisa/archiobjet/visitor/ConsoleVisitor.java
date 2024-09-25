package uha.ensisa.archiobjet.visitor;

import uha.ensisa.archiobjet.composite.classes.Allumable;
import uha.ensisa.archiobjet.composite.classes.Circuit;
import uha.ensisa.archiobjet.composite.classes.Lampe;

public class ConsoleVisitor implements VisitorITF{


    @Override
    public String visitCircuit(Circuit c) {
        System.out.println("\n---\nvisite d'un circuit");

        System.out.println("le circuit a " + c.getAllumables().size() + "elements");
        for (Allumable a : c.getAllumables())
            a.accept(this);
        System.out.println("\n---\n");
        return "";
    }

    @Override
    public String visitLampe(Lampe l) {
        System.out.println("\n---\nvisite d'une lampe");
        if(l.isOn())
            System.out.println("la lampe est allumée");
        else
            System.out.println("la lampe est éteinte");

        System.out.println("\n---\n");
        return "";
    }
}
