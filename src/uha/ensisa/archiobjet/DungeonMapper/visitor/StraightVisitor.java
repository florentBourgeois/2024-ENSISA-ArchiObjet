package uha.ensisa.archiobjet.DungeonMapper.visitor;

import DungeonMapper.composite.BossRoom;
import DungeonMapper.composite.Room;
import DungeonMapper.composite.StartRoom;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StraightVisitor extends Visitor {

    private int x =5;
    private int y = 5;
    private List<Room> visitedRooms = new ArrayList<>();
    private StringBuffer sb = new StringBuffer();


    public String printResultAndReset(){
        String result = sb.toString();
        reset();
        return result;
    }

    @Override
    public String visit(Room room) {
        throw new UnsupportedOperationException("This method is only available to keep OnlyRoomVisitor.  Should not exist otherwise");
    }

    @Override
    public String visitStandardRoom(Room room) {
        this.visitedRooms.add(room);

        sb.append("ajouterSalle("+ x + "," + y + "," + colorToHex(Color.black)+ ");\n");
        visitAdjacentRooms(room);
        return sb.toString();
    }

    @Override
    public String visitBossRoom(BossRoom room) {
        this.visitedRooms.add(room);

        sb.append("ajouterSalle("+ x + "," + y + "," + colorToHex(Color.red)+ ");\n");
        visitAdjacentRooms(room);
        return sb.toString();
    }

    @Override
    public String visitStartRoom(StartRoom room) {
         this.visitedRooms.add(room);

         sb.append("ajouterSalle("+ x + "," + y + "," + colorToHex(Color.green)+ ");\n");
         visitAdjacentRooms(room);

         return sb.toString();
    }

    private String visitAdjacentRooms(Room room){

        // if room has a door to the right then visit the room to the right with the x value incremented by 1
        Room right = room.getRight();
        if (right != null  && !visitedRooms.contains(right)) {
            this.x++;
            right.accept(this);
            this.x--;
        }

        // if room has a door to the left then visit the room to the left with the x value decremented by 1
        Room left = room.getLeft();
        if (left != null && !visitedRooms.contains(left)) {
            this.x--;
            left.accept(this);
            this.x++;
        }

        // if room has a door to the up then visit the room to the up with the y value decremented by 1
        Room up = room.getUp();
        if (up != null && !visitedRooms.contains(up)) {
            this.y--;
            up.accept(this);
            this.y++;
        }

        // if room has a door to the down then visit the room to the down with the y value incremented by 1
        Room down = room.getDown();
        if (down != null && !visitedRooms.contains(down)) {
            this.y++;
            down.accept(this);
            this.y--;
        }
        return sb.toString();
    }

    private void reset(){
        this.x = 5;
        this.y = 5;
        this.visitedRooms.clear();
        this.sb = new StringBuffer();
    }

    private String colorToHex(Color color){
        return String.format("'#%02x%02x%02x'", color.getRed(), color.getGreen(), color.getBlue());
    }
}
