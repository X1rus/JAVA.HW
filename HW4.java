package Video5;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Enter integer numbers\t");
        int count = 0, countMin = 1;
        for (int i = 0; ; i++) {
            arr[i] = in.nextInt();
            if (arr[i] > 0 ) {
                if(arr[i] % 2 == 0)
                 count++;
                continue;
            } else break;
        }
        System.out.println("Count of all entered even numbers\t"+count);
    }
}
