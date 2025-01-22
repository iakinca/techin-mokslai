import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.equals("")) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }
        System.out.print("What information will be printed ");
        String informationPrinted = scanner.nextLine();

        for (int i = 0; i < books.size(); i++) {
            if (informationPrinted.equals("everything")) {
                System.out.println(books.get(i));
            } else if (informationPrinted.equals("name")) {
                System.out.println(books.get(i).getTitle());


            }
        }
    }


}

