package factory;
import produits.Cabinet;
import produits.Chair;
import produits.DinningTable;

public interface FurnitureFactory {
    Cabinet createCabinet();
    Chair createChair();
    DinningTable createDinningTable();
}