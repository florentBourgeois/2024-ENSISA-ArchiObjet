package uha.ensisa.archiobjet.composite.classes;

import uha.ensisa.archiobjet.visitor.VisitorITF;

import java.util.ArrayList;
import java.util.List;

public class Circuit implements Allumable{

    private List<Allumable> allumables = new ArrayList<>();

    public List<Allumable> getAllumables() {
        return allumables;
    }

    public void ajouter(Allumable a){
        allumables.add(a);
    }

    public void allumer(){
        for (Allumable a : allumables){
            a.allumer();
        }
    }

    public void eteindre(){
        for (Allumable a : allumables){
            a.eteindre();
        }
    }

    public boolean isOn(){
        for (Allumable a : allumables){
            if (!a.isOn()){
                return false;
            }
        }
        return true;
    }


    // pour visitor

    @Override
    public void accept(VisitorITF v) {
        v.visitCircuit(this);
    }
}
