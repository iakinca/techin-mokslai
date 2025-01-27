import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here

        ArrayList<Person> persons = new ArrayList<>();
//        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
//        persons.add(new Student("Ollie" ,"6381 Hollywood Blvd. Los Angeles 90028"));
        Student ollie = new Student("Student Lovelace","24 Maddox St. London W1S QN");
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox", 1200);
        Teacher esko = new Teacher("Esko unokene", " Maneerhenmite 15", 5400);

        System.out.println(ollie);
    }

    public static void printPersons(ArrayList<Person> allPersons) {

        for (int i = 0; i < allPersons.size(); i++) {
            System.out.println(allPersons.get(i));
        }
    }
}




