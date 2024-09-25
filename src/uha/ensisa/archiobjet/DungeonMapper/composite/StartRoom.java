package uha.ensisa.archiobjet.DungeonMapper.composite;

import DungeonMapper.visitor.Visitor;

import java.awt.*;

public class StartRoom extends Room{

    public StartRoom(String name) {
        super(name);
        this.color = Color.green;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitStartRoom(this);
    }
}
