package client;
import factory.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("====== STYLE CLASSIQUE ======");
        FurnitureShop classicShop = new FurnitureShop(new ClassicFactory());
        classicShop.sellPack();
        classicShop.sellIndividual("chair");

        System.out.println("====== STYLE CONTEMPORAIN ======");
        FurnitureShop contemporaryShop = new FurnitureShop(new ContemporaryFactory());
        contemporaryShop.sellPack();
        contemporaryShop.sellIndividual("cabinet");

        System.out.println("====== STYLE SCANDINAVE ======");
        FurnitureShop scandinavianShop = new FurnitureShop(new ScandinavianFactory());
        scandinavianShop.sellPack();
        scandinavianShop.sellIndividual("table");
    }
}
