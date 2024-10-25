package JavaPractice.Oct18;

import java.util.Scanner;

public class Lab02SwitchLoop {
    public static void main(String[] args) {

        System.out.println("Program for asking which browser you want to run the code ");

        //Web Automation
        //I will ask user which browser you want to run the code
        // Chrome -> execute Chrome
        //Firefox execute the firefox
        //Edge - Execute the Edge.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the browser (1-3)");
        int browser=sc.nextInt();

        switch(browser)
        {
            case 1:
                System.out.println("Execute on the Chrome");
                break;
            case 2:
                System.out.println("Execute on the Firefox");
                break;
            case 3:
                System.out.println("Execute on the Edge");
                break;
            default:
                System.out.println("Please enter the valid number or browser");
                break;

        }
sc.close();

    }
}
