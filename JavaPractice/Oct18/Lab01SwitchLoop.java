package JavaPractice.Oct18;

import java.util.Scanner;

public class Lab01SwitchLoop {
    public static void main(String[] args) {
        System.out.println("Print the day of the week");

        Scanner sc = new Scanner(System.in);

        System.out.println("Start of the loop");
        System.out.println("Enter the day of the week from (1-7)");

        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea! what day it is");
                break;

        }
        System.out.println("End of the loop");
    }
}
