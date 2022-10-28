package exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GameTester gameTester;
        int hour = 0;

        System.out.println("Add a game tester.");
        // Input name
        System.out.print("Enter the name of tester: ");
        String name = scanner.nextLine();
        // Input hours of work
        System.out.printf("Is %S a full-time tester? (y/n): ", name);
        String isFullTime = scanner.nextLine();
        if (isFullTime.equals("y") || isFullTime.equals("Y")) {
            gameTester = new FullTimeGameTester(name);
        } else {
            gameTester = new PartTimeGameTester(name);
        }
        System.out.printf("how many hours did you work %S? ", name);
        hour = scanner.nextInt();

        //print result
        System.out.printf("\n\nCreated a new Game Tester, %S is a ", gameTester.getName());
        if (gameTester.getStatus()) {
            System.out.print("full-time");
        } else {
            System.out.print("part-time");
        }
        System.out.println(" tester.");
        System.out.printf("The salary is $ %d", gameTester.getSalary(hour));


    }
}
