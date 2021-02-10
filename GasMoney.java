package main;
import java.util.*;

public class GasMoney {
    public static void main (String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("How many miles was your trip: ");
        int miles = kb.nextInt();
        System.out.println("What is the gas price: ");
        double gas = kb.nextDouble();
        System.out.println("How many people are paying gas money?");
        int people = kb.nextInt();

        double owed_money = (miles * gas)/people;
        System.out.println("You owe: $" + owed_money);

        kb.close();
    }
}