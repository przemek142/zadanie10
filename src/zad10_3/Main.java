package zad10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] temp;
        File file = new File("C:\\Users\\przem_000\\zad10\\src\\zad10_3\\produkty.csv");
        Scanner scanner = null;
        int i = 0;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Zła nazwa pliku");
        }
        Product[] products = new Product[10];
        while (scanner != null && scanner.hasNext() && i <= 10) {
            temp = scanner.nextLine().split(";");
            products[i] = new Product(temp[0], temp[1], Double.parseDouble(temp[2]));
            i++;
        }
        System.out.println(Arrays.toString(products));
        System.out.println("Cena wszystkich = " + totalOfAll(products));
        System.out.println("Najwyższa cena = " + highestPrice(products));
    }

    public static double totalOfAll(Product[] products) {
        double total = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null)
                total += products[i].getPrice();
        }

        return total;
    }

    public static double highestPrice(Product[] products) {
        double hp = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getPrice() > hp)
                 hp = products[i].getPrice();
        }

        return hp;
    }
}
