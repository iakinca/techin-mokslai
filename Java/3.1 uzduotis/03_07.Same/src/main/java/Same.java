
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first string:");
        String firstString = scan.nextLine();

        System.out.print("Enter the second string:");
        String secondString = scan.nextLine();

        if (firstString.equals(secondString)) {
            System.out.print("Same");
        } else {
            System.out.print("Different");

        }
    }
}
