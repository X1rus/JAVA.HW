package Video5;

import java.lang.reflect.Array;

public class Task1 {
    public static void main(String[] args) {
        int arr[] = new int[]{-1, -2, -3, -4, -5, 5, 2, 3, 4, 1};
        int max = arr[0];
        int sum = 0;
        int nAmount = 0;
        int pAmount = 0;
        int values;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i]>=0) {
                sum += arr[i];
                pAmount++;
            }
            if(arr[i]<0) nAmount++;

        }
        if (nAmount>=pAmount) System.out.println("Negative more");
        else  System.out.println("Positive  more");
        System.out.println("Max :"+max);
        System.out.println("Sum :"+sum);
        System.out.println("negative numbers :"+nAmount);
    }
}
