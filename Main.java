import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car h = new Car();
        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("type our Brand");

            h.brand = s.next();

            System.out.println("type our Type");
            h.type = s.next();

            System.out.println("type our cc");
            h.cc = s.nextInt();

            System.out.println("type our Weight");
            h.setWeight(s.nextInt());

            System.out.println("type our Height");
            h.setHeight(s.nextInt());

            System.out.println("the acceleration is  =  " + h.getAcceleration() + "\n" + h.toString());

            System.out.println("CONTINUE? (Y o N)");
            String yourchoiche = s.next();

            if (yourchoiche == "no") {
                return;
            }

        }

    }
}