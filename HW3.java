package Video5;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter 5 integer numbers\t");
        int countPos=1, countMin=1, min=arr[0];
        int i=0;
        do {
            arr[i]=in.nextInt();
            i++;
        }while (i!=5);

        for ( i=0;i<arr.length;i++)
        {

         if(countPos==2) {
             System.out.println("second positive number\t"+arr[i]);
             break;

         }
            if(arr[i]>0) ++countPos;

        }

        for ( i=1;i<arr.length;i++)
        {
            if (arr[i] < min) {
                min = arr[i];
                countMin = i+1;

            }
            else continue;


        }

      System.out.println("Min position\t"+countMin);
//        System.out.println("Sum second\t"+sumSecond);
    }
}
