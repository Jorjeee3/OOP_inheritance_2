package Flowers;

import java.time.LocalDate;



public class Main {

    public static String getTotalCost(Flower[] array) {
        double total = 0;

        for (Flower flower : array) {
            total += flower.getCost();
        }

        return "total cost is: " + total;
    }

    public static boolean getBouquetColors(Flower[] array) {
        System.out.println("The Bouquet has next colors: ");

        for (Flower flower : array) {
            System.out.println(flower.getColor());
        }

        return true;
    }

    public static void main(String[] args) {
        Lily lily = new Lily(34.6, LocalDate.now(), 10, "pink");
        Rose rose0 = new Rose(14.1, LocalDate.now(), 14, "white");
        Carnation carnation = new Carnation(9.3, LocalDate.now(), 18, "purple");
        Tulip tulip = new Tulip(54.9, LocalDate.now(), 15, "yellow");
        Rose rose1 = new Rose(27, LocalDate.now(), 14, "red");

        Flower[] flowers = {lily, rose0, carnation, tulip, rose1};

        System.out.println(getTotalCost(flowers));
        System.out.println(getBouquetColors(flowers));
    }
}