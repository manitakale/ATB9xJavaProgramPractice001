package JavaPractice.Oct18;

import java.util.Scanner;

public class Lab03SwitchLoop {
    public static void main(String[] args) {

        System.out.println("program to print on which browser user want to run the code");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the browser name ");

        String browser = sc.next();

        switch(browser)
        {
            case "Chrome":
                System.out.println("Execute on Chrome");
                break;
            case "Firefox":
                System.out.println("Execute on firefox");
                break;
            case "edge":
                System.out.println("Execute on edge");
                break;
            default:
                System.out.println("Please enter the valid browser name");
                break;

        }

    }
}
