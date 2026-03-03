package factory;
import classic.*;
import produits.*;

public class ClassicFactory implements FurnitureFactory {
    public Cabinet createCabinet()         { return new ClassicalCabinet(); }
    public Chair createChair()             { return new ClassicalChair(); }
    public DinningTable createDinningTable(){ return new ClassicalDinningTable(); }
}