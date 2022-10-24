package excercise1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Insurance healthInsurance = new Health();
        Insurance lifeInsurance = new Life();
        Insurance[] insurance = new Insurance[2];
        insurance[0]= healthInsurance;
        insurance[1]= lifeInsurance;




        System.out.println("What is your insurance type?");
        String typeInput = scanner.nextLine();
        switch (typeInput){
            case "health":
                healthInsurance.setType(typeInput);
                break;
            case "life":
                insurance[1].setType(typeInput);


        }
        System.out.println("What is your insurance cost?");
        double costInput = scanner.nextDouble();

    }
}
