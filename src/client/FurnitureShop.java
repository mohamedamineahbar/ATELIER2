package client;
import factory.FurnitureFactory;
import produits.*;

public class FurnitureShop {

    private static final double PACK_DISCOUNT = 0.15; // 15% remise

    private FurnitureFactory factory;

    public FurnitureShop(FurnitureFactory factory) {
        this.factory = factory;
    }

    // Vend un pack complet (cabinet + chair + table) avec 15% de réduction
    public void sellPack() {
        Cabinet cabinet       = factory.createCabinet();
        Chair chair           = factory.createChair();
        DinningTable table    = factory.createDinningTable();

        double total = cabinet.getPrice() + chair.getPrice() + table.getPrice();
        double discounted = total * (1 - PACK_DISCOUNT);

        System.out.println("=== PACK (15% remise) ===");
        System.out.println("  " + cabinet.getDescription()  + " - " + cabinet.getPrice() + " Dh");
        System.out.println("  " + chair.getDescription()    + " - " + chair.getPrice()   + " Dh");
        System.out.println("  " + table.getDescription()    + " - " + table.getPrice()   + " Dh");
        System.out.printf("  Total avant remise : %.2f Dh%n", total);
        System.out.printf("  Total apres remise : %.2f Dh%n%n", discounted);
    }

    // Vend un meuble individuel sans remise
    public void sellIndividual(String type) {
        double price = 0;
        String description = "";

        switch (type.toLowerCase()) {
            case "cabinet":
                Cabinet c = factory.createCabinet();
                description = c.getDescription(); price = c.getPrice(); break;
            case "chair":
                Chair ch = factory.createChair();
                description = ch.getDescription(); price = ch.getPrice(); break;
            case "table":
                DinningTable t = factory.createDinningTable();
                description = t.getDescription(); price = t.getPrice(); break;
            default:
                System.out.println("Type inconnu : " + type); return;
        }

        System.out.println("=== INDIVIDUEL (sans remise) ===");
        System.out.printf("  %s - %.2f Dh%n%n", description, price);
    }
}