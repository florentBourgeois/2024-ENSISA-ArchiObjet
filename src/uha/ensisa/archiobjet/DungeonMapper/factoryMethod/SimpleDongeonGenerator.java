package uha.ensisa.archiobjet.DungeonMapper.factoryMethod;


import uha.ensisa.archiobjet.DungeonMapper.composite.BossRoom;
import uha.ensisa.archiobjet.DungeonMapper.composite.Room;
import uha.ensisa.archiobjet.DungeonMapper.composite.StandardRoom;
import uha.ensisa.archiobjet.DungeonMapper.composite.StartRoom;

public class SimpleDongeonGenerator extends DungeonGenerator {

    @Override
    public Room generate() {
        Room start = new StartRoom("start standard");
        Room sr = new StandardRoom("sr standard");
        start.setRight(sr);
        Room srr = new StandardRoom("srr standard");
        sr.setRight(srr);
        Room srru = new StandardRoom("srru standard");
        srr.setUp(srru);
        Room srrd = new StandardRoom("srrd standard");
        srr.setDown(srrd);
        Room su = new StandardRoom("su standard");
        start.setUp(su);
        Room sul = new BossRoom("sul boss");
        su.setLeft(sul);
        Room sd = new StandardRoom("sd standard");
        start.setDown(sd);
        Room sdd = new StandardRoom("sdd standard");
        sd.setDown(sdd);
        Room sddr = new StandardRoom("sddr standard");
        sdd.setRight(sddr);
        Room sddrr = new StandardRoom("sddrr standard");
        sddr.setRight(sddrr);
        sddrr.setUp(srrd);

        return start;
    }
}
