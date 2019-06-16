package Video4HW;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        int num1,num2,num3;
        System.out.println("Enter an Integer number:");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();


        if ( num1 % 2 == 0 )
            System.out.println("Entered num1 is even");
        else
            System.out.println("Entered num1 is odd");
        if ( num2 % 2 == 0 )
            System.out.println("Entered num2 is even");
        else
            System.out.println("Entered num2 is odd");
        if ( num3 % 2 == 0 )
            System.out.println("Entered num3 is even");
        else
            System.out.println("Entered num3 is odd");
    }
}
