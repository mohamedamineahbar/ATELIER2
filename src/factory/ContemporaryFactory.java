package factory;
import contemporary.*;
import produits.*;

public class ContemporaryFactory implements FurnitureFactory {
    public Cabinet createCabinet()         { return new ContemporaryCabinet(); }
    public Chair createChair()             { return new ContemporaryChair(); }
    public DinningTable createDinningTable(){ return new ContemporaryDinningTable(); }
}