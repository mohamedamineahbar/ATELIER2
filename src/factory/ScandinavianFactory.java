package factory;
import scandinavian.*;
import produits.*;

public class ScandinavianFactory implements FurnitureFactory {
    public Cabinet createCabinet()         { return new ScandinavianCabinet(); }
    public Chair createChair()             { return new ScandinavianChair(); }
    public DinningTable createDinningTable(){ return new ScandinavianDinningTable(); }
}