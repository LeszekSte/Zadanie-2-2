public class Barr {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Bloody Mary";
        drink1.price = 8.50;
        drink1.alcohol = true;


        int nrDrinka = 0;

        System.out.println("Drink nr  - " + ++nrDrinka);
        System.out.printf("Nazwa            %s\n", drink1.name);
        System.out.printf("Cena             %.2f zł\n", drink1.price);

        String alkoholPoPolsku = "nie";

        if (drink1.alcohol) {
            alkoholPoPolsku = "Tak";
        }

        System.out.printf("Zawiera alkohol  %s\n", alkoholPoPolsku);
    }

}
