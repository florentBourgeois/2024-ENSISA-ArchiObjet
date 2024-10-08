package uha.ensisa.archiobjet.DungeonMapper.composite;


import uha.ensisa.archiobjet.DungeonMapper.visitor.Visitor;

public class StandardRoom extends Room{

    public StandardRoom(String name) {
        super(name);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitStandardRoom(this);
    }
}
