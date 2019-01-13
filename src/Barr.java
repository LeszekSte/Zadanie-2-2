public class Barr {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Bloody Mary";
        drink1.price = 8.50;
        drink1.alcohol = true;

        drink1.composition1 = new Composition();
        drink1.composition1.compsition = "Wodka";
        drink1.composition1.qunatity = 50;

        drink1.composition2 = new Composition();
        drink1.composition2.compsition = "Coca-Cola";
        drink1.composition2.qunatity = 60;

        drink1.composition3 = new Composition();
        drink1.composition3.compsition = "Martni";
        drink1.composition3.qunatity = 70;


        double capacityDrink = drink1.composition2.qunatity + drink1.composition2.qunatity + drink1.composition3.qunatity;

        int nrDrinka = 0;

        System.out.println("Drink nr  - " + ++nrDrinka);
        System.out.printf("Nazwa:\t\t\t\t\t%s\n", drink1.name);

        String alkoholPoPolsku = "nie";
        if (drink1.alcohol) {
            alkoholPoPolsku = "Tak";
        }
        System.out.printf("\nZawiera alkohol  \t\t\t- %s\n\n", alkoholPoPolsku);
        System.out.printf("Cena\t\t\t\t\t\t- %.2f zł\n\n", drink1.price);
        System.out.printf("Sladnik 1\t\t%s\t\t- %.0f ml\n", drink1.composition1.compsition, drink1.composition1.qunatity);
        System.out.printf("Sladnik 2\t\t%s\t- %.0f ml\n", drink1.composition2.compsition, drink1.composition2.qunatity);
        System.out.printf("Sladnik 3\t\t%s\t\t- %.0f ml\n", drink1.composition3.compsition, drink1.composition3.qunatity);
        System.out.printf("Pojemność Drinka \t\t\t- %.0f ml\n", capacityDrink);


    }

}
