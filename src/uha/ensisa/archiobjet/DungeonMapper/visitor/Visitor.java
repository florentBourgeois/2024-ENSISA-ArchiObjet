package uha.ensisa.archiobjet.DungeonMapper.visitor;

import DungeonMapper.composite.BossRoom;
import DungeonMapper.composite.Room;
import DungeonMapper.composite.StartRoom;

public abstract class Visitor {

    public abstract String printResultAndReset();

    public abstract String visit(Room room);
    public abstract String visitStandardRoom(Room room);
    public abstract String visitStartRoom(StartRoom room);
    public abstract String visitBossRoom(BossRoom room);

}
