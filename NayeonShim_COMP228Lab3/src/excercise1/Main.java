package excercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Insurance[] insurance = new Insurance[]{new Life(), new Health()};
        try {
            System.out.println("What is your insurance type?");
            String typeInput = scanner.nextLine();
            if (typeInput == "health") {
                insurance[0].setType(typeInput);

            } else if (typeInput == "life") {
                insurance[1].setType(typeInput);

            }else{
                throw new Exception("wrong type try again");
            }
            System.out.println("What is your insurance cost?");
            double costInput = scanner.nextDouble();
            if(costInput >0 ){
                switch (typeInput){
                    case "health":
                        insurance[0].setMonthlyCost(costInput);
                        break;
                    case "life":
                        insurance[1].setMonthlyCost(costInput);
                        break;
                }

                throw new Exception("wrong: put the valid number");
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }



    }
}
