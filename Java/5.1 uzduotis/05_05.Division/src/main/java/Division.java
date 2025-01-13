import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numerator: ");
        int numerator = scanner.nextInt();
        System.out.println("Denominator: ");
        int denominator = scanner.nextInt();
        division(numerator, denominator);
    }

    // implement the method here

    public static void division(int numerator, int denominator) {
        double result = ((double) numerator) / denominator;
        System.out.println(result);
    }
}
