package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     *
     * @param ??? return methods that can be painted on the screen
     * @return ??? returns value from a method
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of your loan: ");
        int amount = sc.nextInt();
        int l = amount;
        int percent;
        int payment;

        System.out.println("You need to pay 10% of the remaining amount each month.");
        System.out.println("");

        for (int i = 0 ; i < 1 ; i++){
            percent = l * 10 /100;
            payment = l - percent;
            l = payment;
        }
        System.out.println("The remaining amount after 1 month is " + l);

        for (int i = 0 ; i < 1 ; i++) {
            percent = l * 10 /100;
            payment = l - percent;
            l = payment;
        }
        System.out.println("The remaining amount after 2 months is " + l);

        for (int i = 0 ; i < 1; i++) {
            percent = l * 10 /100;
            payment = l - percent;
            l = payment;
        }
        System.out.println("The remaining amount after 3 months is " + l);
    }
}

