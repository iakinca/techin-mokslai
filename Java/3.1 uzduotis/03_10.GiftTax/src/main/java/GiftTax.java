
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Value of the gift?");
        int giftValue = scan.nextInt();
        double tax;

        if (giftValue < 5000) {
            System.out.print("No tax!");

        } else if (giftValue <= 25000) {
            tax = 100 + (giftValue - 5000) * 0.08;
            System.out.print("Tax: " + tax);

        } else if (giftValue <= 55000) {
            tax = 1700 + (giftValue - 25000) * 0.10;
            System.out.print("Tax: " + tax);

        } else if (giftValue <= 200000) {
            tax = 4700 + (giftValue - 55000) * 0.12;
            System.out.print("Tax: " + tax);

        } else if (giftValue <= 1000000) {
            tax = 22100 + (giftValue - 200000) * 0.15;
            System.out.print("Tax: " + tax);


        } else {
            tax = 142100 + (giftValue - 1000000) * 0.17;
            System.out.print("Tax: " + tax);
        }

    }
}
