package JavaPractice.Oct17;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int age;
        System.out.println("Enter the age :");
        age = sc.nextInt();
        System.out.println();


        if (age>=18)
        {

            System.out.println("You can vote");
        }
        else {
            System.out.println("You can not Vote");
        }
    }
}
