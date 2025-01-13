
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int countOfStars = 1;
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(countOfStars);
            countOfStars = countOfStars + 2;
        }

        printBase(countOfStars - 2);
    }

    public static void printBase(int countOfStars) {
        int height = 2;
        int width = 3;

        for (int i = 1; i <= height; i++) {
            printSpaces((countOfStars - width) / 2);
            printStars(width);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
