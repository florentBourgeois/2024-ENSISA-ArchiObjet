package uha.ensisa.archiobjet.DungeonMapper.composite;

import DungeonMapper.visitor.Visitor;

import java.awt.*;

public class BossRoom extends Room{

    public BossRoom(String name) {
        super(name);
        this.color = Color.red;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBossRoom(this);
    }
}
