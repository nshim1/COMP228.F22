package exercise1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Insurance[] insuranceList = new Insurance[2];
        Insurance insurance;

        System.out.println("What is your insurance type? \n- Health\n- Life");
        String typeInput = scanner.nextLine();
        if ((typeInput.equals("Health") || typeInput.equals("HEALTH") || typeInput.equals("health"))) {
            insuranceList[0] = new Health();


        } else if ((typeInput.equals("Life") || typeInput.equals("LIFE") || typeInput.equals("life"))) {
            insuranceList[0] = new Life();
        }
        System.out.println("What is your monthly fee?");
        double costInput = scanner.nextDouble();
        insuranceList[0].setInsuranceCost(costInput);
        insuranceList[0].displayInfo();
    }
}







