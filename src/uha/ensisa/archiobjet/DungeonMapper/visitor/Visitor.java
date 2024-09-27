package uha.ensisa.archiobjet.DungeonMapper.visitor;


import uha.ensisa.archiobjet.DungeonMapper.composite.*;

public abstract class Visitor {

    public abstract String printResultAndReset();

    public abstract String visit(Room room);
    public abstract String visitStandardRoom(Room room);
    public abstract String visitStartRoom(StartRoom room);
    public abstract String visitBossRoom(BossRoom room);

}
