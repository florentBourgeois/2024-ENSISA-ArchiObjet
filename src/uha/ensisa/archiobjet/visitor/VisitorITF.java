package uha.ensisa.archiobjet.visitor;

import uha.ensisa.archiobjet.composite.classes.Circuit;
import uha.ensisa.archiobjet.composite.classes.Lampe;

public interface VisitorITF {

    public String visitCircuit(Circuit c);
    public String visitLampe(Lampe l );

}
