
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation childerHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println(ethan.getName() + " weight: " + childerHospital.weigh(ethan) + " kilos");

        childerHospital.feed(ethan);
        childerHospital.feed(ethan);
        childerHospital.feed(ethan);

        System.out.println(ethan.getName() + " weight: " + childerHospital.weigh(ethan) + " kilos");
    }
}

