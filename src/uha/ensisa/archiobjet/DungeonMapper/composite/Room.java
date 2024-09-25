package uha.ensisa.archiobjet.DungeonMapper.composite;

import DungeonMapper.visitor.Visitable;
import DungeonMapper.visitor.Visitor;

import java.awt.*;

public abstract class Room implements Visitable {

    private Room up, down, left, right;
    private final String name;
    protected Color color = Color.black;

    public Room(String name) {
        this.name = name;
    }

    public Room getUp() {
        return up;
    }

    public void setUp(Room up) {
        this.up = up;
        up.down = this;
    }

    public Room getDown() {
        return down;
    }

    public void setDown(Room down) {
        this.down = down;
        down.up = this;
    }

    public Room getLeft() {
        return left;
    }

    public void setLeft(Room left) {
        this.left = left;
        left.right = this;
    }

    public Room getRight() {
        return right;
    }

    public void setRight(Room right) {
        this.right = right;
        right.left = this;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public String toHTML() {
        return "<div class=\"room\"></div>";
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
