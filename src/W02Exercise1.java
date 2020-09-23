import java.util.Scanner;

public class W02Exercise1 {
    public static void main(String[] args) {
        Scanner customer = new Scanner(System.in);
        System.out.println("Price 1:");
        double priceOfBurger1 = customer.nextDouble();
        System.out.println("Price 2:");
        double priceOfBurger2 = customer.nextDouble();
        System.out.println("Price 3:");
        double priceOfBurger3 = customer.nextDouble();
        double averagePriceOfBurgers = (priceOfBurger1 + priceOfBurger2 + priceOfBurger3)/3;
        System.out.println("The average price is " + averagePriceOfBurgers);
    }

}