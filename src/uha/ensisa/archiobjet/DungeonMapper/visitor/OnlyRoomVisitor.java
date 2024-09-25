package uha.ensisa.archiobjet.DungeonMapper.visitor;

import DungeonMapper.composite.BossRoom;
import DungeonMapper.composite.Room;
import DungeonMapper.composite.StartRoom;

import java.util.ArrayList;
import java.util.List;

public class OnlyRoomVisitor extends Visitor {

    private int x =5;
    private int y = 5;
    private List<Room> visitedRooms = new ArrayList<>();


    public String printResultAndReset(){
        reset();
        return "";
    }

    @Override
    public String visit(Room room) {

        this.visitedRooms.add(room);

        StringBuffer sb = new StringBuffer();
        sb.append("ajouterSalle("+ x + "," + y + ", '#000000');\n");

        // if room has a door to the right then visit the room to the right with the x value incremented by 1
        Room right = room.getRight();
        if (right != null  && !visitedRooms.contains(right)) {
            this.x++;
            sb.append(visit(right));
            this.x--;
        }

        // if room has a door to the left then visit the room to the left with the x value decremented by 1
        Room left = room.getLeft();
        if (left != null && !visitedRooms.contains(left)) {
            this.x--;
            sb.append(visit(left));
            this.x++;
        }

        // if room has a door to the up then visit the room to the up with the y value decremented by 1
        Room up = room.getUp();
        if (up != null && !visitedRooms.contains(up)) {
            this.y--;
            sb.append(visit(up));
            this.y++;
        }

        // if room has a door to the down then visit the room to the down with the y value incremented by 1
        Room down = room.getDown();
        if (down != null && !visitedRooms.contains(down)) {
            this.y++;
            sb.append(visit(down));
            this.y--;
        }
        return sb.toString();
    }

    @Override
    public String visitStandardRoom(Room room) {
        return this.visit(room);
    }

    @Override
    public String visitStartRoom(StartRoom room) {
        return this.visit(room);
    }

    @Override
    public String visitBossRoom(BossRoom room) {
        return this.visit(room);
    }

    public void reset(){
        this.x = 5;
        this.y = 5;
        this.visitedRooms.clear();
    }
}

