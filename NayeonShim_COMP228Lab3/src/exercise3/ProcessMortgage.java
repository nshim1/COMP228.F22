package exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ProcessMortgage {
    public static void main(String[] args) {
        int size = 3;
        Mortgage[] mortgages = new Mortgage[size];
        Scanner input = new Scanner(System.in);
        int mortgageType = 1;
        String customerName = "";
        int mortgageNum = 0;
        double amount = 0;
        int term = 0;
        boolean isValid = false;

        // Prompt the user for the current interest rate
        System.out.println("Enter your current interest rate: ");
        double rate = input.nextDouble();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter mortgage type (1 = Business, 2 = Personal): ");
            mortgageType = input.nextInt();
            input.nextLine();
            System.out.print("Enter mortgage number: ");
            mortgageNum = input.nextInt();
            input.nextLine();
            System.out.print("Enter your name: ");
            customerName = input.nextLine();
            System.out.print("Input mortgage amount($): ");
            amount = input.nextDouble();
            boolean isValidAmount = false;

            //amount prompt
            while (!isValidAmount) {
                input.nextLine();
                if (!Mortgage.isValidAmount(amount)) {
                    System.out.println("The amount is over $300,000.");
                } else {
                    isValidAmount = true;
                }
            }
            System.out.print("Input mortgage term (year): ");
            term = input.nextInt();


            if (mortgageType == 1) {
                mortgages[i] = new BusinessMortgage(mortgageNum, customerName, amount, rate, term);
                Mortgage.type = "Business";
            } else if (mortgageType == 2) {
                mortgages[i] = new PersonalMortgage(mortgageNum, customerName, amount, rate, term);
                Mortgage.type = "Personal";
            }
        }
        for (int i = 0; i < size; i++) {
            mortgages[i].getMortageInfo();
        }

    }
}
