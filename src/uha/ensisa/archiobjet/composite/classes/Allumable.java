package uha.ensisa.archiobjet.composite.classes;

import uha.ensisa.archiobjet.visitor.VisitorITF;

public interface Allumable {

    public void allumer();
    public void eteindre();
    public boolean isOn();


    // pour visitor
    public void accept(VisitorITF v);
}
