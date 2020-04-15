import java.util.Scanner;

public class Kodutöö1 {

    public static void main(String[] args)
    {
        System.out.println("\n Kodutöö 1.1 \n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisestage raadius: ");
        double r = scan.nextDouble();

        ruut.ruut(r);
        ring.ring_p(r);
        ring.ring_y(r);

        System.out.println("\n Kodutöö 1.2 \n");

        Expenses expense = new Expenses();
        expense.fill_array(500, 1500);
        System.out.println("Töötajate palgad enne palgatõusu");
        expense.show_salaries();

        System.out.println("Alla mis summat tõstame palkasid?");
        int b = scan.nextInt();
        System.out.println("Mitu protsenti tõstame palkasid?");
        int a = scan.nextInt();

        expense.change_salary(a,b);
        System.out.println("Töötajate palgad peale palgatõusu");
        expense.show_salaries();

        System.out.println("\n Kodutöö 1.3 \n");

        System.out.println("Sisestage temperatuur");
        int temp = scan.nextInt();
        Heat_sensor.is_hot(temp);
        scan.close();
        System.out.println("Tänan mängimast! Olete teeninud pika pai! :) ");
    }
}