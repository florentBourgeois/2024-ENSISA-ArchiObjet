package uha.ensisa.archiobjet.DungeonMapper;


import uha.ensisa.archiobjet.DungeonMapper.composite.Room;
import uha.ensisa.archiobjet.DungeonMapper.factoryMethod.DungeonGenerator;
import uha.ensisa.archiobjet.DungeonMapper.factoryMethod.SimpleDongeonGenerator;
import uha.ensisa.archiobjet.DungeonMapper.visitor.StraightVisitor;
import uha.ensisa.archiobjet.DungeonMapper.visitor.Visitor;

public class Main {
    public static void main(String[] args) {
        //demoHTML();
        DungeonGenerator dungeonGenerator = new SimpleDongeonGenerator();
        demoStraightVisitor(dungeonGenerator);


    }

    public static void demoHTML(){
        UtilsHTML.writeHTMLToIndex("     ajouterSalle(4, 4);\n" +
                "        ajouterSalle(5, 4);  \n" +
                "        ajouterSalle(4, 5);  " +
                "        ajouterSalle(1, 1);  " +
                "        ajouterSalle(1, 2);  " +
                "        ajouterSalle(2, 1);  " +
                "        ajouterSalle(2, 2);  " +
                "        ajouterSalle(3, -1);  " +
                "        ajouterSalle(10, 20);  " +
                "        ajouterSalle(-10, -21);  ");
    }

    public static void demoStraightVisitor(DungeonGenerator dungeonGenerator){
        Room dungeon = dungeonGenerator.generate();
        Visitor visitor = new StraightVisitor();
        dungeon.accept(visitor);
        String dungeonHTML = visitor.printResultAndReset();
        UtilsHTML.writeHTMLToIndex(dungeonHTML);
    }
}