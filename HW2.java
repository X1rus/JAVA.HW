package Video5;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter 10 integer numbers\t");
        int sumFirst=0, sumSecond=0;
        int i=0;
        do {
            arr[i]=in.nextInt();
            i++;
        }while (i!=10);

        for ( i=0;i<arr.length;i++)
        {
            if(i>=0 && i<5) sumFirst+=arr[i];
            else if(sumFirst>0) {
            break;
            }
            else if(i>=5 && i<10) sumSecond+=arr[i];

        }

        System.out.println("Sum first\t"+sumFirst);
        System.out.println("Sum second\t"+sumSecond);
    }
}
